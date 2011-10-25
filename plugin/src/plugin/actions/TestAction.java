package plugin.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import util.FooUtil;

public class TestAction implements IWorkbenchWindowActionDelegate {

	public TestAction() {
	}

	public void init(IWorkbenchWindow window) {
	}

	public void run(IAction action) {
		System.out.println("Action invoked");
		FooUtil.foo();
	}

	public void selectionChanged(IAction action, ISelection selection) {
	}

	public void dispose() {
	}

}