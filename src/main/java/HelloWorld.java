import com.intellij.execution.actions.ConfigurationContext;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

public class HelloWorld extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent event) {
        // TODO: insert action logic here
        // Using the event, create and show a dialog
        Project currentProject = event.getProject();
        String dlgTitle = event.getPresentation().getDescription();
        // If an element is selected in the editor, add info about it.

        final ConfigurationContext context = ConfigurationContext.getFromContext(event.getDataContext());
        System.out.println("CONTEXT: " + context);
        Messages.showMessageDialog(currentProject,"Welcom to the Gradle world!", dlgTitle, Messages.getInformationIcon());
    }
}
