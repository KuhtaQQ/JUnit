package by.academy.jUint.homework;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class ListenerMain extends  BlockJUnit4ClassRunner{
	private CalculatorTestListener runner;

	public ListenerMain(Class<CalculatorTestListener> listener) throws InitializationError {
		super(listener);
		runner = new CalculatorTestListener();
	}

	@Override
	public void run(final RunNotifier notifier) {
		notifier.addListener(runner);
		super.run(notifier);
	}

}
