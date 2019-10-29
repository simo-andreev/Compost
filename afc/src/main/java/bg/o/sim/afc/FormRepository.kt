package bg.o.sim.afc

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.MapperFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule


interface IFormRepository {
    fun getForm(name: String): AfcForm
}

data class AfcForm(
    val uiSchema: AfcNode,
    val modelSchema: AfcNode,

    val model: MutableMap<String, Any>
)


object FormRepository : IFormRepository {
    override fun getForm(name: String): AfcForm {
        val uiSchema = JacksonObjMapper.fromString(tempSchema, AfcNode::class.java)
        val modelSchema = AfcNode(NodeType.Object)

        return AfcForm(uiSchema, modelSchema, mutableMapOf())
    }

    val tempSchema = """{
    "type": "VerticalLayout",
    "elements": [
        {
            "type": "HorizontalLayout",
            "elements": [
                {
                    "type": "Control",
                    "scope": "#/properties/name",
                    "label": "Name",
                    "options": {
                        "variant": "outlined"
                    }
                },
                {
                    "type": "Control",
                    "scope": "#/properties/personalData/properties/age"
                },
                {
                    "type": "Control",
                    "scope": "#/properties/birthDate"
                }
            ]
        },
        {
            "type": "Label",
            "text": "Additional Information"
        },
        {
            "type": "HorizontalLayout",
            "elements": [
                {
                    "type": "Control",
                    "scope": "#/properties/personalData/properties/height"
                },
                {
                    "type": "Control",
                    "scope": "#/properties/nationality"
                },
                {
                    "type": "Control",
                    "scope": "#/properties/occupation",
                    "suggestion": [
                        "Accountant",
                        "Engineer",
                        "Freelancer",
                        "Journalism",
                        "Physician",
                        "Student",
                        "Teacher",
                        "Other"
                    ]
                }
            ]
        }
    ]
}"""
}


/** Configured objectMapper for JSON serialization/deserialization */
object JacksonObjMapper : ObjectMapper() {

    init {
        registerModule(KotlinModule())
        configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS, true)
    }

    fun <Key, Value> toMap(item: Any): Map<Key, Value>? = convertValue(item, object : TypeReference<Map<Key, Value>>() {})
    fun <T> fromMap(source: Map<String, Any>, targetClass: Class<out T>): T = convertValue(source, targetClass)

    fun <T> toString(item: T): String = writeValueAsString(item)
    fun <T> fromString(source: String, targetClass: Class<out T>): T = readValue(source, targetClass)
}