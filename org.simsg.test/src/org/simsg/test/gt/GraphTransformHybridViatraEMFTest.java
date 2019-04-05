package org.simsg.test.gt;

import org.simsg.core.pm.viatra.ViatraEngineWrapper;
import org.simsg.core.pmc.hybrid.HybridPMC;

public class GraphTransformHybridViatraEMFTest extends GraphTransformTest {

	@Override
	protected void initEngine() {
		engine = new ViatraEngineWrapper();
	}

	@Override
	protected void initPMC() {
		pmc = new HybridPMC();
	}

}
