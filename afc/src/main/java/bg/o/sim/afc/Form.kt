package bg.o.sim.afc

import android.widget.FrameLayout
import androidx.ui.core.setContent

fun androidx.fragment.app.Fragment.setFormContentView(formName: String): FrameLayout {
    val form = FormRepository.getForm("asdasd")
    return FrameLayout(context).apply {
        setContent {
            AfcForm(form.uiSchema)
        }
    }

}

/** Single node in an AFC /Auto-Form-Configurator/ JSON schema/form */
data class AfcNode(
    // Common fields
    val type: NodeType,

    // UI Schema fields
    val scope: String? = null,
    val options: Options? = null,
    val elements: Collection<AfcNode>? = null,
    val suggestion: Collection<String>? = null,

    // Model Schema fields
    val enum: Collection<String>? = null,
    val properties: Collection<Property>? = null,
    val required: Collection<String>? = null,
    val text: String? = null
)

enum class NodeType {
    // Model Schema Types
    Object,

    // UI Schema Types
    CategorizationObject,

    VerticalLayout,
    HorizontalLayout,

    Label,
    Control;

    fun isUiNode() = when (this) {
        CategorizationObject, Control, Label, VerticalLayout, HorizontalLayout -> true
        else -> false
    }

    fun isComposite() = when (this) {
        VerticalLayout, HorizontalLayout -> true
        else -> false
    }
}

data class Options(
    val layout: Layout?,
    val variant: Variant?
) {
    enum class Layout {
        Tabs
    }

    enum class Variant {
        Outlined
    }
}


data class Property(
    val type: PropertyType,
    val maximum: Float?,
    val minimum: Float?,
    val default: Any?,
    val description: String?,

    val maxLength: Int?
)

enum class PropertyType(java: Class<*>) {
    Number(java.lang.Float::class.java),
    Integer(java.lang.Integer::class.java),
    String(java.lang.String::class.java),
    Boolean(java.lang.Boolean::class.java);
}