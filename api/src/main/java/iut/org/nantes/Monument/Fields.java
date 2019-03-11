
package iut.org.nantes.Monument;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "departement", "commmail", "visitegroupeguideesurdemande", "visitegroupeguideeenpermanence",
		"commmob", "ouverturealannee", "codepostal", "tarifgratuit", "objecttypename", "adresse2", "modepaiement",
		"languesparleesaccueil", "gmaplatitude0", "visitelanguesparlees", "visiteguideesurdemande",
		"visitegroupepedagogiqueenpermanence", "gmaplongitude0", "commune", "visitelibreenpermanence",
		"visiteguideeenpermanence", "nomoffre", "visitegroupelibreenpermanence", "acces",
		"thememuseecentreinterpretation", "codeinseecommune", "localisation", "animauxacceptes", "accueilgroupe",
		"type", "commweb", "accueilgroupemax", "adresse1", "themesitesetmonuments", "ouverturegranule", "equipements",
		"pointinteretvisiblesansvisite", "categoriesitesetmonuments", "commtel", "categoriemuseecentreinterpretation",
		"resadirecte", "stylearchitecturalsitesetmonuments", "activitessurplace", "visitedureemoyenne", "adresse3",
		"plateformeurl", "visitedureemoyennegroupe", "visitelanguespanneaux", "tarifs", "commfax", "accueilgroupemin",
		"videosurl" })
public class Fields {

	@JsonProperty("departement")
	private String departement;
	@JsonProperty("commmail")
	private String commmail;
	@JsonProperty("visitegroupeguideesurdemande")
	private String visitegroupeguideesurdemande;
	@JsonProperty("visitegroupeguideeenpermanence")
	private String visitegroupeguideeenpermanence;
	@JsonProperty("commmob")
	private String commmob;
	@JsonProperty("ouverturealannee")
	private String ouverturealannee;
	@JsonProperty("codepostal")
	private String codepostal;
	@JsonProperty("tarifgratuit")
	private String tarifgratuit;
	@JsonProperty("objecttypename")
	private String objecttypename;
	@JsonProperty("adresse2")
	private String adresse2;
	@JsonProperty("modepaiement")
	private String modepaiement;
	@JsonProperty("languesparleesaccueil")
	private String languesparleesaccueil;
	@JsonProperty("gmaplatitude0")
	private Double gmaplatitude0;
	@JsonProperty("visitelanguesparlees")
	private String visitelanguesparlees;
	@JsonProperty("visiteguideesurdemande")
	private String visiteguideesurdemande;
	@JsonProperty("visitegroupepedagogiqueenpermanence")
	private String visitegroupepedagogiqueenpermanence;
	@JsonProperty("gmaplongitude0")
	private Double gmaplongitude0;
	@JsonProperty("commune")
	private String commune;
	@JsonProperty("visitelibreenpermanence")
	private String visitelibreenpermanence;
	@JsonProperty("visiteguideeenpermanence")
	private String visiteguideeenpermanence;
	@JsonProperty("nomoffre")
	private String nomoffre;
	@JsonProperty("visitegroupelibreenpermanence")
	private String visitegroupelibreenpermanence;
	@JsonProperty("acces")
	private String acces;
	@JsonProperty("thememuseecentreinterpretation")
	private String thememuseecentreinterpretation;
	@JsonProperty("codeinseecommune")
	private String codeinseecommune;
	@JsonProperty("localisation")
	private List<String> localisation = null;
	@JsonProperty("animauxacceptes")
	private String animauxacceptes;
	@JsonProperty("accueilgroupe")
	private String accueilgroupe;
	@JsonProperty("type")
	private String type;
	@JsonProperty("commweb")
	private String commweb;
	@JsonProperty("accueilgroupemax")
	private String accueilgroupemax;
	@JsonProperty("adresse1")
	private String adresse1;
	@JsonProperty("themesitesetmonuments")
	private String themesitesetmonuments;
	@JsonProperty("ouverturegranule")
	private String ouverturegranule;
	@JsonProperty("equipements")
	private String equipements;
	@JsonProperty("pointinteretvisiblesansvisite")
	private String pointinteretvisiblesansvisite;
	@JsonProperty("categoriesitesetmonuments")
	private String categoriesitesetmonuments;
	@JsonProperty("commtel")
	private String commtel;
	@JsonProperty("categoriemuseecentreinterpretation")
	private String categoriemuseecentreinterpretation;
	@JsonProperty("resadirecte")
	private String resadirecte;
	@JsonProperty("stylearchitecturalsitesetmonuments")
	private String stylearchitecturalsitesetmonuments;
	@JsonProperty("activitessurplace")
	private String activitessurplace;
	@JsonProperty("visitedureemoyenne")
	private String visitedureemoyenne;
	@JsonProperty("adresse3")
	private String adresse3;
	@JsonProperty("plateformeurl")
	private String plateformeurl;
	@JsonProperty("visitedureemoyennegroupe")
	private String visitedureemoyennegroupe;
	@JsonProperty("visitelanguespanneaux")
	private String visitelanguespanneaux;
	@JsonProperty("tarifs")
	private String tarifs;
	@JsonProperty("commfax")
	private String commfax;
	@JsonProperty("accueilgroupemin")
	private String accueilgroupemin;
	@JsonProperty("videosurl")
	private String videosurl;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("departement")
	public String getDepartement() {
		return departement;
	}

	@JsonProperty("departement")
	public void setDepartement(String departement) {
		this.departement = departement;
	}

	@JsonProperty("commmail")
	public String getCommmail() {
		return commmail;
	}

	@JsonProperty("commmail")
	public void setCommmail(String commmail) {
		this.commmail = commmail;
	}

	@JsonProperty("visitegroupeguideesurdemande")
	public String getVisitegroupeguideesurdemande() {
		return visitegroupeguideesurdemande;
	}

	@JsonProperty("visitegroupeguideesurdemande")
	public void setVisitegroupeguideesurdemande(String visitegroupeguideesurdemande) {
		this.visitegroupeguideesurdemande = visitegroupeguideesurdemande;
	}

	@JsonProperty("visitegroupeguideeenpermanence")
	public String getVisitegroupeguideeenpermanence() {
		return visitegroupeguideeenpermanence;
	}

	@JsonProperty("visitegroupeguideeenpermanence")
	public void setVisitegroupeguideeenpermanence(String visitegroupeguideeenpermanence) {
		this.visitegroupeguideeenpermanence = visitegroupeguideeenpermanence;
	}

	@JsonProperty("commmob")
	public String getCommmob() {
		return commmob;
	}

	@JsonProperty("commmob")
	public void setCommmob(String commmob) {
		this.commmob = commmob;
	}

	@JsonProperty("ouverturealannee")
	public String getOuverturealannee() {
		return ouverturealannee;
	}

	@JsonProperty("ouverturealannee")
	public void setOuverturealannee(String ouverturealannee) {
		this.ouverturealannee = ouverturealannee;
	}

	@JsonProperty("codepostal")
	public String getCodepostal() {
		return codepostal;
	}

	@JsonProperty("codepostal")
	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}

	@JsonProperty("tarifgratuit")
	public String getTarifgratuit() {
		return tarifgratuit;
	}

	@JsonProperty("tarifgratuit")
	public void setTarifgratuit(String tarifgratuit) {
		this.tarifgratuit = tarifgratuit;
	}

	@JsonProperty("objecttypename")
	public String getObjecttypename() {
		return objecttypename;
	}

	@JsonProperty("objecttypename")
	public void setObjecttypename(String objecttypename) {
		this.objecttypename = objecttypename;
	}

	@JsonProperty("adresse2")
	public String getAdresse2() {
		return adresse2;
	}

	@JsonProperty("adresse2")
	public void setAdresse2(String adresse2) {
		this.adresse2 = adresse2;
	}

	@JsonProperty("modepaiement")
	public String getModepaiement() {
		return modepaiement;
	}

	@JsonProperty("modepaiement")
	public void setModepaiement(String modepaiement) {
		this.modepaiement = modepaiement;
	}

	@JsonProperty("languesparleesaccueil")
	public String getLanguesparleesaccueil() {
		return languesparleesaccueil;
	}

	@JsonProperty("languesparleesaccueil")
	public void setLanguesparleesaccueil(String languesparleesaccueil) {
		this.languesparleesaccueil = languesparleesaccueil;
	}

	@JsonProperty("gmaplatitude0")
	public Double getGmaplatitude0() {
		return gmaplatitude0;
	}

	@JsonProperty("gmaplatitude0")
	public void setGmaplatitude0(Double gmaplatitude0) {
		this.gmaplatitude0 = gmaplatitude0;
	}

	@JsonProperty("visitelanguesparlees")
	public String getVisitelanguesparlees() {
		return visitelanguesparlees;
	}

	@JsonProperty("visitelanguesparlees")
	public void setVisitelanguesparlees(String visitelanguesparlees) {
		this.visitelanguesparlees = visitelanguesparlees;
	}

	@JsonProperty("visiteguideesurdemande")
	public String getVisiteguideesurdemande() {
		return visiteguideesurdemande;
	}

	@JsonProperty("visiteguideesurdemande")
	public void setVisiteguideesurdemande(String visiteguideesurdemande) {
		this.visiteguideesurdemande = visiteguideesurdemande;
	}

	@JsonProperty("visitegroupepedagogiqueenpermanence")
	public String getVisitegroupepedagogiqueenpermanence() {
		return visitegroupepedagogiqueenpermanence;
	}

	@JsonProperty("visitegroupepedagogiqueenpermanence")
	public void setVisitegroupepedagogiqueenpermanence(String visitegroupepedagogiqueenpermanence) {
		this.visitegroupepedagogiqueenpermanence = visitegroupepedagogiqueenpermanence;
	}

	@JsonProperty("gmaplongitude0")
	public Double getGmaplongitude0() {
		return gmaplongitude0;
	}

	@JsonProperty("gmaplongitude0")
	public void setGmaplongitude0(Double gmaplongitude0) {
		this.gmaplongitude0 = gmaplongitude0;
	}

	@JsonProperty("commune")
	public String getCommune() {
		return commune;
	}

	@JsonProperty("commune")
	public void setCommune(String commune) {
		this.commune = commune;
	}

	@JsonProperty("visitelibreenpermanence")
	public String getVisitelibreenpermanence() {
		return visitelibreenpermanence;
	}

	@JsonProperty("visitelibreenpermanence")
	public void setVisitelibreenpermanence(String visitelibreenpermanence) {
		this.visitelibreenpermanence = visitelibreenpermanence;
	}

	@JsonProperty("visiteguideeenpermanence")
	public String getVisiteguideeenpermanence() {
		return visiteguideeenpermanence;
	}

	@JsonProperty("visiteguideeenpermanence")
	public void setVisiteguideeenpermanence(String visiteguideeenpermanence) {
		this.visiteguideeenpermanence = visiteguideeenpermanence;
	}

	@JsonProperty("nomoffre")
	public String getNomoffre() {
		return nomoffre;
	}

	@JsonProperty("nomoffre")
	public void setNomoffre(String nomoffre) {
		this.nomoffre = nomoffre;
	}

	@JsonProperty("visitegroupelibreenpermanence")
	public String getVisitegroupelibreenpermanence() {
		return visitegroupelibreenpermanence;
	}

	@JsonProperty("visitegroupelibreenpermanence")
	public void setVisitegroupelibreenpermanence(String visitegroupelibreenpermanence) {
		this.visitegroupelibreenpermanence = visitegroupelibreenpermanence;
	}

	@JsonProperty("acces")
	public String getAcces() {
		return acces;
	}

	@JsonProperty("acces")
	public void setAcces(String acces) {
		this.acces = acces;
	}

	@JsonProperty("thememuseecentreinterpretation")
	public String getThememuseecentreinterpretation() {
		return thememuseecentreinterpretation;
	}

	@JsonProperty("thememuseecentreinterpretation")
	public void setThememuseecentreinterpretation(String thememuseecentreinterpretation) {
		this.thememuseecentreinterpretation = thememuseecentreinterpretation;
	}

	@JsonProperty("codeinseecommune")
	public String getCodeinseecommune() {
		return codeinseecommune;
	}

	@JsonProperty("codeinseecommune")
	public void setCodeinseecommune(String codeinseecommune) {
		this.codeinseecommune = codeinseecommune;
	}

	@JsonProperty("localisation")
	public List<String> getLocalisation() {
		return localisation;
	}

	@JsonProperty("localisation")
	public void setLocalisation(List<String> localisation) {
		this.localisation = localisation;
	}

	@JsonProperty("animauxacceptes")
	public String getAnimauxacceptes() {
		return animauxacceptes;
	}

	@JsonProperty("animauxacceptes")
	public void setAnimauxacceptes(String animauxacceptes) {
		this.animauxacceptes = animauxacceptes;
	}

	@JsonProperty("accueilgroupe")
	public String getAccueilgroupe() {
		return accueilgroupe;
	}

	@JsonProperty("accueilgroupe")
	public void setAccueilgroupe(String accueilgroupe) {
		this.accueilgroupe = accueilgroupe;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("commweb")
	public String getCommweb() {
		return commweb;
	}

	@JsonProperty("commweb")
	public void setCommweb(String commweb) {
		this.commweb = commweb;
	}

	@JsonProperty("accueilgroupemax")
	public String getAccueilgroupemax() {
		return accueilgroupemax;
	}

	@JsonProperty("accueilgroupemax")
	public void setAccueilgroupemax(String accueilgroupemax) {
		this.accueilgroupemax = accueilgroupemax;
	}

	@JsonProperty("adresse1")
	public String getAdresse1() {
		return adresse1;
	}

	@JsonProperty("adresse1")
	public void setAdresse1(String adresse1) {
		this.adresse1 = adresse1;
	}

	@JsonProperty("themesitesetmonuments")
	public String getThemesitesetmonuments() {
		return themesitesetmonuments;
	}

	@JsonProperty("themesitesetmonuments")
	public void setThemesitesetmonuments(String themesitesetmonuments) {
		this.themesitesetmonuments = themesitesetmonuments;
	}

	@JsonProperty("ouverturegranule")
	public String getOuverturegranule() {
		return ouverturegranule;
	}

	@JsonProperty("ouverturegranule")
	public void setOuverturegranule(String ouverturegranule) {
		this.ouverturegranule = ouverturegranule;
	}

	@JsonProperty("equipements")
	public String getEquipements() {
		return equipements;
	}

	@JsonProperty("equipements")
	public void setEquipements(String equipements) {
		this.equipements = equipements;
	}

	@JsonProperty("pointinteretvisiblesansvisite")
	public String getPointinteretvisiblesansvisite() {
		return pointinteretvisiblesansvisite;
	}

	@JsonProperty("pointinteretvisiblesansvisite")
	public void setPointinteretvisiblesansvisite(String pointinteretvisiblesansvisite) {
		this.pointinteretvisiblesansvisite = pointinteretvisiblesansvisite;
	}

	@JsonProperty("categoriesitesetmonuments")
	public String getCategoriesitesetmonuments() {
		return categoriesitesetmonuments;
	}

	@JsonProperty("categoriesitesetmonuments")
	public void setCategoriesitesetmonuments(String categoriesitesetmonuments) {
		this.categoriesitesetmonuments = categoriesitesetmonuments;
	}

	@JsonProperty("commtel")
	public String getCommtel() {
		return commtel;
	}

	@JsonProperty("commtel")
	public void setCommtel(String commtel) {
		this.commtel = commtel;
	}

	@JsonProperty("categoriemuseecentreinterpretation")
	public String getCategoriemuseecentreinterpretation() {
		return categoriemuseecentreinterpretation;
	}

	@JsonProperty("categoriemuseecentreinterpretation")
	public void setCategoriemuseecentreinterpretation(String categoriemuseecentreinterpretation) {
		this.categoriemuseecentreinterpretation = categoriemuseecentreinterpretation;
	}

	@JsonProperty("resadirecte")
	public String getResadirecte() {
		return resadirecte;
	}

	@JsonProperty("resadirecte")
	public void setResadirecte(String resadirecte) {
		this.resadirecte = resadirecte;
	}

	@JsonProperty("stylearchitecturalsitesetmonuments")
	public String getStylearchitecturalsitesetmonuments() {
		return stylearchitecturalsitesetmonuments;
	}

	@JsonProperty("stylearchitecturalsitesetmonuments")
	public void setStylearchitecturalsitesetmonuments(String stylearchitecturalsitesetmonuments) {
		this.stylearchitecturalsitesetmonuments = stylearchitecturalsitesetmonuments;
	}

	@JsonProperty("activitessurplace")
	public String getActivitessurplace() {
		return activitessurplace;
	}

	@JsonProperty("activitessurplace")
	public void setActivitessurplace(String activitessurplace) {
		this.activitessurplace = activitessurplace;
	}

	@JsonProperty("visitedureemoyenne")
	public String getVisitedureemoyenne() {
		return visitedureemoyenne;
	}

	@JsonProperty("visitedureemoyenne")
	public void setVisitedureemoyenne(String visitedureemoyenne) {
		this.visitedureemoyenne = visitedureemoyenne;
	}

	@JsonProperty("adresse3")
	public String getAdresse3() {
		return adresse3;
	}

	@JsonProperty("adresse3")
	public void setAdresse3(String adresse3) {
		this.adresse3 = adresse3;
	}

	@JsonProperty("plateformeurl")
	public String getPlateformeurl() {
		return plateformeurl;
	}

	@JsonProperty("plateformeurl")
	public void setPlateformeurl(String plateformeurl) {
		this.plateformeurl = plateformeurl;
	}

	@JsonProperty("visitedureemoyennegroupe")
	public String getVisitedureemoyennegroupe() {
		return visitedureemoyennegroupe;
	}

	@JsonProperty("visitedureemoyennegroupe")
	public void setVisitedureemoyennegroupe(String visitedureemoyennegroupe) {
		this.visitedureemoyennegroupe = visitedureemoyennegroupe;
	}

	@JsonProperty("visitelanguespanneaux")
	public String getVisitelanguespanneaux() {
		return visitelanguespanneaux;
	}

	@JsonProperty("visitelanguespanneaux")
	public void setVisitelanguespanneaux(String visitelanguespanneaux) {
		this.visitelanguespanneaux = visitelanguespanneaux;
	}

	@JsonProperty("tarifs")
	public String getTarifs() {
		return tarifs;
	}

	@JsonProperty("tarifs")
	public void setTarifs(String tarifs) {
		this.tarifs = tarifs;
	}

	@JsonProperty("commfax")
	public String getCommfax() {
		return commfax;
	}

	@JsonProperty("commfax")
	public void setCommfax(String commfax) {
		this.commfax = commfax;
	}

	@JsonProperty("accueilgroupemin")
	public String getAccueilgroupemin() {
		return accueilgroupemin;
	}

	@JsonProperty("accueilgroupemin")
	public void setAccueilgroupemin(String accueilgroupemin) {
		this.accueilgroupemin = accueilgroupemin;
	}

	@JsonProperty("videosurl")
	public String getVideosurl() {
		return videosurl;
	}

	@JsonProperty("videosurl")
	public void setVideosurl(String videosurl) {
		this.videosurl = videosurl;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
