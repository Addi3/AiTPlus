
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.addie.aitplus.init;

import net.addie.aitplus.procedures.TakeMeToTrenzalorRightClickedProcedure;
import net.addie.aitplus.procedures.TakeMeToGallifreyRightclickedProcedure;
import net.addie.aitplus.procedures.CadonwoodOnBlockRightClickedProcedure;
import net.addie.aitplus.procedures.CadonLogOnBlockRightClickedProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class AitplusModProcedures {
	public static void load() {
		new TakeMeToGallifreyRightclickedProcedure();
		new TakeMeToTrenzalorRightClickedProcedure();
		new CadonwoodOnBlockRightClickedProcedure();
		new CadonLogOnBlockRightClickedProcedure();
	}
}
