import com.intellij.execution.actions.ConfigurationContext;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.pom.Navigatable;

public class ShowSelectedElement extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent event) {
        // Using the event, create and show a dialog
        Project currentProject = event.getProject();
        StringBuilder dlgMsg = new StringBuilder("【"+event.getPresentation().getText() + "】Menu Selected!");
        String dlgTitle = "" + event.getPresentation().getDescription();
        // If an element is selected in the editor, add info about it.
        Navigatable nav = event.getData(CommonDataKeys.NAVIGATABLE);
        if (nav != null) {
            dlgMsg.append(String.format("\nSelected Element: %s", nav));
        }
        final ConfigurationContext context = ConfigurationContext.getFromContext(event.getDataContext());
        System.out.println("CONTEXT: " + context);
        Messages.showMessageDialog(currentProject, dlgMsg.toString(), dlgTitle, Messages.getInformationIcon());
    }
}
