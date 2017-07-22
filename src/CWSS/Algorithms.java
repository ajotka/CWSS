package CWSS;

public class Algorithms {

	/* Technical Impact (TI)
	 * Acquired Privilege (AP) 
	 * Acquired Privilege Layer (AL) 
	 * Internal Control Effectiveness (IC) 
	 * Finding Confidence (FC) 
	 * Required Privilege (RP) 
	 * Required Privilege Layer (RL) 
	 * Access Vector (AV) 
	 * Authentication Strength (AS)
	 * Level of Interaction (IN) 
	 * Deployment Scope (SC) 
	 * Business Impact (BI) 
	 * Likelihood of Discovery (DI) 
	 * Likelihood of Exploit (EX) 
	 * External Control Effectiveness (EC) 
	 * Prevalence (P) */

	//pobieranie z mapy: Vector.get("");
	
	public static void calc() {

		GUI.setResult("\n======================\n");
		
		/* Base = [(10 + 5 * TechnicalImpact * (AcquiredPrivilege + 
		 * AcquiredPrivilegeLayer) + 5 * FindingConfidence) * f(TechnicalImpact) * 
		 * InternalControlEffectiveness] * 4.0
		 */
		//fTechImpact -> pomocnicza do Subscore (base)
			double fTechImpact;
			if(Vector.get("TI") == 0) {
				fTechImpact = 0;
			}
			else fTechImpact = 1;
		
		double base = ((10 + 5 * Vector.get("TI") * (Vector.get("AP") + Vector.get("AL")) + 5 * Vector.get("FC")) * fTechImpact * Vector.get("IC"))*4;
		GUI.setResult("\nBase: " + base);
		
		
		/* [20 * (RequiredPrivilege + RequiredPrivilegeLayer + AccessVector) + 
		 * 20 * DeploymentScope + 15 * LevelOfInteraction + 5 * 
		 * AuthenticationStrength] / 100.0 
		 */
		double ass = (20 * (Vector.get("RP") + Vector.get("RL") + Vector.get("AV")) + 20 * Vector.get("SC") + 15 * Vector.get("IN") + 5 * Vector.get("AS"))/100;
		GUI.setResult("\nAss: " + ass);
		
		
		/* [ (10*BusinessImpact + 3*LikelihoodOfDiscovery + 
		 * 4*LikelihoodOfExploit + 3*Prevalence) * f(BusinessImpact) * 
		 * ExternalControlEffectiveness ] / 20.0
		 */
		
		//fBusiness Impact -> pomocnicza do Environmental Subscore (es)
				double fBusinessImpact;
				if(Vector.get("BI") == 0)
					fBusinessImpact = 0;
				else fBusinessImpact = 1;
				
		double es = ((10 * Vector.get("BI") + 3 * Vector.get("DI") + 4*Vector.get("EX") + 3 * Vector.get("P")) * fBusinessImpact * Vector.get("EC"))/20.0;
		GUI.setResult("\nEs: " + es);
		
		
		//SCORE = BaseSubscore * AttackSurfaceScore * EnvironmentSubscore
		double score = base * ass * es;
		GUI.setResult("\nScore: " + score);

	}
}
