package bg.o.sim.afc

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.core.Text
import androidx.ui.core.TextField
import androidx.ui.layout.Column
import androidx.ui.layout.FlexScope
import androidx.ui.layout.LayoutSize
import androidx.ui.layout.Row

@Composable
fun AfcForm(afcForm: AfcNode) {
    require(afcForm.type.isUiNode()) {
        "Bruh. Can't build UI from a Model/Data Schema bruh (-_-)" +
                "Got node of type [${afcForm.type}]"
    }

    if (afcForm.type.isComposite()) {
        when (afcForm.type) {
            NodeType.VerticalLayout -> Column {
                for (node in afcForm.elements!!) AfcForm(afcForm = node)
            }

            NodeType.HorizontalLayout -> Row(modifier = , mainAxisSize = LayoutSize.Expand) {
                setmod
                for (node in afcForm.elements!!) AfcForm(afcForm = node)
            }

            else -> TODO()
        }
    } else {
        WidgetProvider.getWidget(node = afcForm)
    }
}

object WidgetProvider {
    @Composable
    fun getWidget(node: AfcNode): Unit {
        when (node.type) {
            NodeType.Object -> TODO()
            NodeType.CategorizationObject -> TODO()
            NodeType.VerticalLayout -> TODO()
            NodeType.HorizontalLayout -> TODO()
            NodeType.Label -> Text(text = node.text!!)
            NodeType.Control -> TextField(value = node.scope!!)
        }
    }
}