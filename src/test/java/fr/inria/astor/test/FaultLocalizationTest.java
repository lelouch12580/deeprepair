package fr.inria.astor.test;

import fr.inria.astor.test.repair.evaluation.regression.MathCommandsTests;
import fr.inria.main.CommandSummary;
import fr.inria.main.FaultLocalizationMain;
import fr.inria.main.FaultLocalizationMain.FaultLocalization;

public class FaultLocalizationTest {
	@org.junit.Test
	public void testFLMath70() throws Exception {
		FaultLocalizationMain main = new FaultLocalizationMain();
		CommandSummary cs = MathCommandsTests.getMath70Command();
		// by default, max generations is zero, that means, it does not evolve
		cs.command.put("-faultlocalization", FaultLocalization.GZOLTAR.name());
		cs.command.put("-flthreshold", "0.0001");

		// We execute astor for creating the model and run FL

		main.execute(cs.flat());

	}

	@org.junit.Test
	public void testFLMath70FC() throws Exception {
		FaultLocalizationMain main = new FaultLocalizationMain();
		CommandSummary cs = MathCommandsTests.getMath70Command();
		// by default, max generations is zero, that means, it does not evolve
		cs.command.put("-faultlocalization", FaultLocalization.FLACOCO.name());
		cs.command.put("-flthreshold", "0.0001");

		// We execute astor for creating the model and run FL

		main.execute(cs.flat());

	}

	@org.junit.Test
	public void testFLMath70Ngz() throws Exception {
		FaultLocalizationMain main = new FaultLocalizationMain();
		CommandSummary cs = MathCommandsTests.getMath70Command();
		// by default, max generations is zero, that means, it does not evolve
		cs.command.put("-faultlocalization", FaultLocalization.GZOLTAR1_7.name());
		cs.command.put("-flthreshold", "0.0000");
		cs.command.put("-parameters", "includeZeros:false:keepGZoltarFiles:false");

		// We execute astor for creating the model and run FL

		main.execute(cs.flat());

	}
}