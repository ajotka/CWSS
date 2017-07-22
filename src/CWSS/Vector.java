package CWSS;

import java.util.HashMap;
import java.util.Map;
import Enums.EAccessVector;
import Enums.EAcquiredPrivilege;
import Enums.EAcquiredPrivilegeLayer;
import Enums.EAuthenticationStrength;
import Enums.EBusinessImpact;
import Enums.EDeploymentScope;
import Enums.EExternalControlEffectiveness;
import Enums.EFindingConfidence;
import Enums.EInternalControlEffectiveness;
import Enums.ELevelOfInteraction;
import Enums.ELikelihoodOfDiscovery;
import Enums.ELikelihoodOfExploit;
import Enums.EPrevalence;
import Enums.ERequiredPrivilege;
import Enums.ERequiredPrivilegeLayer;
import Enums.ETechnicalImpact;

public class Vector {
	
	
	static Map<String, Double> Numbers = new HashMap<String, Double>();
	static Map<String, String> Words = new HashMap<String, String>();

	public static void create() {

		
		for(ETechnicalImpact TI: ETechnicalImpact.values()) {
		    if ( TI.getCode().equals( Words.get("TI") ) )
		    	GUI.setResult("\nTI:\t" + TI.getLiteral());
		}
		for(EAcquiredPrivilege AP: EAcquiredPrivilege.values()) {
		    if ( AP.getCode().equals( Words.get("AP") ) )
		    	GUI.setResult("\nAP:\t" + AP.getLiteral());
		}
		for(EAcquiredPrivilegeLayer AL: EAcquiredPrivilegeLayer.values()) {
		    if ( AL.getCode().equals( Words.get("AL") ) )
		    	GUI.setResult("\nAL:\t" + AL.getLiteral());
		}
		for(EInternalControlEffectiveness IC: EInternalControlEffectiveness.values()) {
		    if ( IC.getCode().equals( Words.get("IC") ) )
		    	GUI.setResult("\nIC:\t" + IC.getLiteral());
		}
		for(EFindingConfidence FC: EFindingConfidence.values()) {
		    if ( FC.getCode().equals( Words.get("FC") ) )
		    	GUI.setResult("\nFC:\t" + FC.getLiteral());
		}
		for(ERequiredPrivilege RP: ERequiredPrivilege.values()) {
		    if ( RP.getCode().equals( Words.get("RP") ) )
		    	GUI.setResult("\nRP:\t" + RP.getLiteral());
		}
		for(ERequiredPrivilegeLayer RL: ERequiredPrivilegeLayer.values()) {
		    if ( RL.getCode().equals( Words.get("RL") ) )
		    	GUI.setResult("\nRL:\t" + RL.getLiteral());
		}
		for(EAccessVector AV: EAccessVector.values()) {
		    if ( AV.getCode().equals( Words.get("AV") ) )
		    	GUI.setResult("\nAV:\t" + AV.getLiteral());
		}
		for(EAuthenticationStrength AS: EAuthenticationStrength.values()) {
		    if ( AS.getCode().equals( Words.get("AS") ) )
		    	GUI.setResult("\nAS:\t" + AS.getLiteral());
		}
		for(ELevelOfInteraction IN: ELevelOfInteraction.values()) {
		    if ( IN.getCode().equals( Words.get("IN") ) )
		    	GUI.setResult("\nIN:\t" + IN.getLiteral());
		}
		for(EDeploymentScope SC: EDeploymentScope.values()) {
		    if ( SC.getCode().equals( Words.get("SC") ) )
		    	GUI.setResult("\nSC:\t" + SC.getLiteral());
		}
		for(EBusinessImpact BI: EBusinessImpact.values()) {
		    if ( BI.getCode().equals( Words.get("BI") ) )
		    	GUI.setResult("\nBI:\t" + BI.getLiteral());
		}
		for(ELikelihoodOfDiscovery DI: ELikelihoodOfDiscovery.values()) {
		    if ( DI.getCode().equals( Words.get("DI") ) )
		    	GUI.setResult("\nDI:\t" + DI.getLiteral());
		}
		for(ELikelihoodOfExploit EX: ELikelihoodOfExploit.values()) {
		    if ( EX.getCode().equals( Words.get("EX") ) )
		    	GUI.setResult("\nEX:\t" + EX.getLiteral());
		}
		for(EExternalControlEffectiveness EC: EExternalControlEffectiveness.values()) {
		    if ( EC.getCode().equals( Words.get("EC") ) )
		    	GUI.setResult("\nEC:\t" + EC.getLiteral());
		}
		for(EPrevalence P: EPrevalence.values()) {
		    if ( P.getCode().equals( Words.get("P") ) )
		    	GUI.setResult("\nP:\t" + P.getLiteral());
		}
		
	}

	public static double get(String faktor) {
		return Numbers.get(faktor);		
	}
	
	public static void setLiteral(String faktor, String literal) {
		Words.put( faktor, literal );		
	}
	public static void setNumeral(String faktor, Double val) {
		Numbers.put( faktor, val );		
	}
	
}
