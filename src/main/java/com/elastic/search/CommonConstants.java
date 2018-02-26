package com.elastic.search;

import java.util.HashMap;

public class CommonConstants {
	
	public static final String UTC_TIME_ZONE = "UTC";
	
	
	public static final String COMMON_USER_LOGIN_URL = "/user";
	public static final String SHOW_USER_LOGIN_PAGE = "/login";
	public static final String VALIDATE_USER = "/validateUser";
	
	// property
	public static final String PROPERTY_READER = "propertyReader";
	public static final String APPLICATION_PROPERTY_FILE_NAME = "application.properties";
	
	public static final String VALIDATION_UTILS = "validationUtills";
	public static final String ERROR_PROPERTY_READER = "errorPropertyReader";
	public static final String ERROR_PROPERTIES_FILENAME = "error.properties";
	public static final String ERROR_CODE_HELPER = "errorCodeHelper";
	
	//table Name
	public static final String ASSAYPLATE_TBL = "assayplates";
	public static final String ASSAYPLATE_C_FAMILY = "ap";
	public static final String SOP_TBL = "sops";
	public static final String SOP_C_FAMILY = "s";
	
	public static final String EMP_TRAINING_TBL = "emptraining";
	public static final String EMP_TRAINING_C_FAMILY = "e";

	public static final String EMP_TEMP_TBL = "emptemplate";
	public static final String EMP_TEMP_C_FAMILY = "t";
	
	public static final String IRV_TBL = "irv";
	public static final String IRV_C_FAMILY = "i";
	
	// Tbl clients columns
   	public static final String TBL_WELLS = "wells";
   	public static final String WELLS_COL_Family = "wl";
   	
	public static final long MAX_SIZE = 5;
	public static final String FILE_EXTENSIONS = ".doc,.docx,.txt,.pdf,.xls,.xlsx,.png,.jpg,.jpeg,.csv,.zip";
	public static final String SLASH = "/";
	public static final String DOT = ".";
	public static final String ISACTIVE = "1";
	public static final String ISARCHIVE = "0";
	public static String SET_DEFAULT_ENCODING = "UTF-8";
	public static final String USER_MAIL_ID = "email";
	public static final String EMAIL_REGEX = "^[a-z0-9._%+-]+@[a-z0-9-]+(\\.[a-z]{2,6}){1,2}$";
	public static final String EMAIL_REGEX_LMS = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9-]+(\\.[A-Za-z]{2,6}){1,2}$";
	
	//email 
    public static final String MAIL_SMTP_PORT = "mail.smtp.port";
    public static final String MAIL_SMTP_AUTH = "mail.smtp.auth";
    public static final String MAIL_SMTP_START_TLS_ENABLE = "mail.smtp.starttls.enable";
    public static final String EMAIL_BODY_TYPE = "text/html";
    public static final String TRANSPORT_TYPE = "smtp";
    public static final String HOST = "HOST";
    public static final String USERNAME = "HOST_USERNAME";
    public static final String USERNAME_FROM = "USERNAME_FROM";
    public static final String PASS = "HOST_PASSWORD";
    public static final String MAIL_SMTP_START_TLS_ENABLE_PROPERTY = "MAIL_SMTP_START_TLS_ENABLE";
    public static final String MAIL_SMTP_PORT_PROPERTY = "MAIL_SMTP_PORT";
    public static final String MAIL_SMTP_AUTH_PROPERTY = "MAIL_SMTP_AUTH";
    public static final String MAIL_TRANSPORT_PROTOCOL_PROPERTY = "MAIL_TRANSPORT_PROTOCOL";
    public static final String MAIL_DEBUG_TRUE_PROPERTY = "MAIL_DEBUG_TRUE";
    
    public static final String NAME = "userName";
    public static final String LNAME = "latName";
    public static final String UNAME = "UserName";
    public static final String SIGNATURE = "signature";
    public static final String SIGNATURE_CONTENT = "AsedaScience Team";
    public static final String FORGET_PASSWORD_SUBJECT = "Reset Password Link";
    public static final String FORGET_USERNAME_SUBJECT = "Get Your User Name";
    public static final String WELCOME_EMAIL_SUBJECT = "Welcome to AsedaSciences";
    public static final String FORGOT_PASS_TEMPLATE_PATH = "FORGOT_PASS_TEMPLATE_FILE_LOCATION";
    public static final String FORGOT_UNAME_TEMPLATE_PATH = "FORGOT_UNAME_TEMPLATE_FILE_LOCATION";
    public static final String WELCOME_USER_TEMPLATE_PATH = "WELCOME_USER_TEMPLATE_FILE_LOCATION";
	public static final String SOPNAME = "sopName";
    public static final String SITEURL = "siteurl";
    public static final String SOP_EMAIL_SUBJECT = "Review SOP";
	public static final String SOP_TEMPLATE_PATH = "SOP_TEMPLATE_FILE_LOCATION";
    public static final String LINK = "link";
    public static final String LINK_CONTENT = "Reset Your Password";
    public static final String LINK_LOCATION = "linklocation";
    public static final String LINK_LOCATION_CONTENT = "/forgetPassword.html";
    
    public static final String EMAIL_PROPERTY_READER = "emailPropertyReader";
    public static final String EMAIL_PROPERTIES_FILENAME = "email.properties";
    public static final String TEMPLATE_ENCODING = "TEMPLATE_ENCODING";
    public static final String MAIL_TRANSPORT_PROTOCOL = "mail.transport.protocol";
    public static final String MAIL_DEBUG = "mail.debug";
	
	
	// velocity Configurations
	public static final String RESOURCE_LOADER = "resource.loader";
	public static final String RESOURCE_LOADER_CLASS = "class.resource.loader.class";
	public static final String RESOURCE_LOADER_VALUE = "class";
	public static final String RESOURCE_LOADER_CLASS_VALUE = "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader";

	
	
	public static String[] CURATION_STATUS = {"curSts","pCr","pRCt","pRCD","sCr","sRCt","sRCD"};
	
	public static String[] ANNOTATION_USE = {"tsp","dATPS","aTPTSby","tsi","dATSet","aTTSby","aTPDb","dATPDb","aTPDBBy"};
	
	public static String[] UPDATES_DATA = {"dOLCU","cUBy","cRNo","cUrd","cURBy","pCUTPDB"};
		
	public static String[] MSDS_DATA = {"msds"};
	
	public static String[] SCREEN_TWO_DATA = {"snyms","cmpny","cmsgt","clCls","cdSSt","cdSts","tpAra","tgtOn","tpcCs","dsese","dFAYr","dEAYr","pMoMm","sMTgs","pIdcs","sIdcs","rOfAn","dose","msds","cdOgn", "attachmentId"};
	
	public static String[] SCREEN_FOUR_DATA = {"ccABVl","ccABCt","ccBAVl","ccBACt","cco2Ct","ccFfRt","ccSvPr","mtSHP","mtSHR","mtSRP","mtSRR","mtSvPr","plPrBg","bioAvl","hlfLife","hlfLifeU","doseHu","doseUt","cmaxHu","cmaxU","cP450S","cP450Ind","cP450Inh","cP450IC50","cSerPrv","trSub","trInd","trinh","trIC50","trSerPrv","adSum","adRef","adPMID","pmidPdf"};

	public static String[] SCREEN_FIVE_DATA = {"chi","mor","cmi","ros","gsh","nmi","cc","nmit","mmp","prob","hivt","coft","toft","catoft","orgn","hergi","hergic50","kcsep","tofcdp","conlw","conhg","tclw","tchg","ctud","smofcs","rcwl","rcbpc","sumoft","sotref","sotpmid" ,"toxPdf"};
	
	public static String[] NATRL_PRDT_DATA = {"cSpcs","cSrc","cCmnNm","usdInTrMed","cOrigin","country","priUse","secUse"};
	
	public static String[] CMPD_CHMCL_CHRTRSTCS = {"cSmls","inChl","molFl","chmblId","pubChmId","chmSpdrId","molFrmla","mW","hbd","hba","psa","cLogP","cLogD","arRings","rotBndsNo","hAtmCnt","sp3","qedWt","mlclrSpcs","pKA","kd"};
	
	public static String[] SCREEN_SEVEN_DATA = {"comp", "ipown", "dtelic", "licnsr", "orglic", "astaq", "cmaq", "aqprc", "upfrt", "mlstn", "rolty", "litsm", "saat", "dsac", "sbat", "dsbc", "sbct", "dscc", "sbdt", "dsdc", "sbet", "dsec", "sbft", "dsfc", "sbgt", "dsgc", "ipoa", "dipo","prcur", "secur","intra", "incta", "intrb", "inctb", "intrc", "inctc", "intrd", "inctd", "intre", "incte", "intrf", "inctf", "intrg", "inctg"};

	public static String[] SCREEN_SIX_DATA = {"atp","ldh","cEffectGsh","alt","ast","albmn", "toxClsfn","cmnToxCritra","toxClsfnEU","toxClsfnUS","glblHrmnzdSys","glblHrmnzdSysLbl","cmpSmryPhrmclgy","anmlToxcDtAvl","tSpcs","soat","tcaLst","soatRf","soatPmid","soatpmpdf"};

	public static String[] CMPD_CELR_EFFCT = {"atp","ldh","cEffectGsh","alt","ast","albmn"};
	
	public static String[] CMPD_TOXCITY_CLSFN = {"toxClsfn","cmnToxCritra","toxClsfnEU","toxClsfnUS","glblHrmnzdSys","glblHrmnzdSysLbl"};
	
	public static String[] CMPD_PHRMCOLOGY_SMRY = {"cmpSmryPhrmclgy"};
	
	public static String[] TOXCTY_CURATD_ANML = {"anmlToxcDtAvl","tSpcs","soat","tcaLst","soatRf","soatPmid","soatpmpdf"};
	
	public static String[] COMPOUND_DATA = {"cNm", "cId", "asId", "libPltBrCd", "dtRcvd","csId", "libPltId", "wlId", "clntnm", "clntnum","cscn","cscu","csclogo"};
	
	public static String[] CLIENT_DATA = {"nm","num","addr","cty","pstCod","ctry"};
	
	public static String[] CLIENT_PO_DATA = {"nm","num","po","poDt","poVal","cur","noCpd","refMtaMsaNo","refSowNo","poDept","poContNm","poContEm","poContPh","libPlts"};
	
	public static String[] CLIENT_MTA_MSA_SOW = {"nm","num","mtaMsaNo","sowNo","mtaMsaEffDt","mtaMsaTrm","mtaMsaExpDt","sowEffDt","sowTrm","sowExpDt","mtaDpt","mtaConNm","mtaConEm","mtaConPh","mtaMsas"};
	
	public static String[] CLIENT_REPORT = {"nm","num","po","poDt","noCpd","repId","dtRepCom"};
	
	public static String[] CLIENT_REPORT_FILE = {"repFlKy","repFlNm"};
	
	public static String[] TRAINING_SET_DATA = {"id", "cNm", "cId","csId", "libPltId", "wlId", "mor","cmi", "ros", "gsh", "nmi1", "nmi2", "cc", "mmp", "prob", "chi", "tsp", "tsi"};
	
	public static String[] SCREEN_EIGHT_DATA = {"curSts","pCr","pRCt","pRCD","sCr","sRCt","sRCD","tsp","dATPS","aTPTSby","tsi","dATSet","aTTSby","aTPDb","dATPDb","aTPDBBy", "dOLCU","cUBy","cRNo","cUrd","cURBy","pCUTPDB"};

	public static String[] USER_DATA = {"fstNm", "surNm", "usrStat", "usrId", "uplImg", "pos", "usrNm", "em", "secEm", "accLvl", "mobNo", "usrSDt", "usrEDT", "tmpPwd", "usrStPwd", "que1", "ans1", "que2", "ans2", "que3", "ans3", "que4", "ans4", "que5", "ans5", "isAct"};
	
	public static String[] CURATION_SCREEN_ONE = {"cNm", "cId", "asId", "libPltBrCd", "dtRcvd","csId", "libPltId", "wlId", "clntnm", "clntnum","cscn","cscu","csclogo", "curSts","pCr","pRCt","pRCD","sCr","sRCt","sRCD","tsp","dATPS","aTPTSby","tsi","dATSet","aTTSby","aTPDb","dATPDb","aTPDBBy","dOLCU","cUBy","cRNo","cUrd","cURBy","pCUTPDB"};
	
	public static String[] IRV_DATA = {"cnm","cnum","dtScr","libPltId","plt1ANo","plt1ADesc","plt1ABarNo","plt1BNo","plt1BDesc","plt1BBarNo","plt1ANo1","plt1A1Desc"
			,"plt1A1BarNo","plt1BNo1","plt1B1Desc","plt1B1BarNo","lotFlId","lotFlNm","plt1ASts","plt1BProStat","plt1A2Sts","plt1B2ProStat"
			,"clCulFlId","clCulFlNm","libPlt1ACol","libPlt1A2Col","libPlt1BCol","libPlt1B2Col","plt1ATyp","plt1A2Typ","plt1BTyp","plt1B2Typ","scrNm","scnDesc","pltTyp"
			,"libPltBarNo","clntLibPltRecDt","noCpdRecLibPlt","catlogNo","clntPoNo","othDocId","clCultOprtNm","clCulOprtId","clCulHudNo","scnOprtNm","scnOptId","pod"
			,"plt1ANote","plt1BNote","plt1ANoId","plt1BNoId","plt1A2NoId","plt1B2NoId"};
	
	public static String[] ASSAY_PLT_DATA = {"clnum","clnm","libPltId","dtScr","scnOptId","plt1ATyp","plt1ANo","plt1ABarNo","plt1ADesc","plt1ASts","libPlt1ACol",
			"plt1BTyp","plt1BNo","plt1BBarNo","plt1BDesc","plt1BProStat","libPlt1BCol","scrNm","scnDesc"};
	
	public static String[] QC_QUARANTINE = {"cnum","p1ano1","scqcrevcmplndt","pqcfcaus","pqcfdesc","soprnam","ccoprnam"};
	
	public static String[] MONTLY_QC_REPORT = {"strtDt","endDt","allAssPlts","rFilId","rFilNm"};
	
	public static String[] QUALITY_MGMT = {"qmRvwDt","upldBy","postn","pFilId","pFilNm","mmFilId","mmFilNm"};
	
	public static String[] SOP_DATA = {"sNum", "sNam", "vNum", "aDte", "sPdf", "pBy", "pbyP", "aBy", "abyP", "nStr", "nSrb", "sPaId", "isArc", "sopId", "oVNm", "oADt"};
	
	public static String[] EMPLOYEE_TARINING_DATA = {"strT", "strD", "strV", "etrT", "etrD", "etrV", "otrT", "otrD", "otrV", "stId", "etId", "otId", "tId"};
	
	public static String[] EMPLOYEE_TEMPLATE_DATA = {"ertId", "eNm", "eId", "ePos", "trD", "tR", "trId"};
	
	public static String[] BIOLOGY = {"sNm","prO","chiO","rpsO","fsD","ssD","cmiD","rosD","gshD","nmiSrD","cc","nmiPiD","mmpD"
			,"oBo","ptdb","dt","eid"};
	
	
	
	
	
	public final static HashMap<String, String> accesslevel = new HashMap<String, String>();
	static
	{
		accesslevel.put("admin", "Administrator");
		accesslevel.put("bdevelopment", "Business Development");
		accesslevel.put("consultant", "Consultant");
		accesslevel.put("contractor", "Contractor");
		accesslevel.put("curator", "Curator");
		accesslevel.put("exmanagement", "Executive Management");
		accesslevel.put("finance", "Finance");
		accesslevel.put("hresources", "Human Resources");
		accesslevel.put("legal", "Legal");
		accesslevel.put("opmanagement", "Operations Management");
		accesslevel.put("opscientist", "Operations Scientist");
		accesslevel.put("qamanagement", "Quality Management");
		accesslevel.put("rdmanagement", "R&D Management");
		accesslevel.put("rdscientist", "R&D Scientist");
		accesslevel.put("slmarketing", "Sales and Marketing");
	}
	
	
	// Error code constants

	public static final String E1000_ERROR_CODE = "RH-HTTP_CODE-E1000";
	public static final String E1000_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1000";

	public static final String E1001_ERROR_CODE = "RH-HTTP_CODE-E1001";
	public static final String E1001_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1001";

	public static final String E1002_ERROR_CODE = "RH-HTTP_CODE-E1002";
	public static final String E1002_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1002";

	public static final String E1003_ERROR_CODE = "RH-HTTP_CODE-E1003";
	public static final String E1003_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1003";

	public static final String E1004_ERROR_CODE = "RH-HTTP_CODE-E1004";
	public static final String E1004_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1004";

	public static final String E1005_ERROR_CODE = "RH-HTTP_CODE-E1005";
	public static final String E1005_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1005";

	public static final String E1006_ERROR_CODE = "RH-HTTP_CODE-E1006";
	public static final String E1006_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1006";

	public static final String E1007_ERROR_CODE = "RH-HTTP_CODE-E1007";
	public static final String E1007_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1007";

	public static final String E1008_ERROR_CODE = "RH-HTTP_CODE-E1008";
	public static final String E1008_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1008";

	public static final String E1009_ERROR_CODE = "RH-HTTP_CODE-E1009";
	public static final String E1009_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1009";

	public static final String E1010_ERROR_CODE = "RH-HTTP_CODE-E1010";
	public static final String E1010_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1010";

	public static final String E1011_ERROR_CODE = "RH-HTTP_CODE-E1011";
	public static final String E1011_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1011";

	public static final String E1012_ERROR_CODE = "RH-HTTP_CODE-E1012";
	public static final String E1012_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1012";

	public static final String E1013_ERROR_CODE = "RH-HTTP_CODE-E1013";
	public static final String E1013_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1013";

	public static final String E1014_ERROR_CODE = "RH-HTTP_CODE-E1014";
	public static final String E1014_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1014";

	public static final String E1015_ERROR_CODE = "RH-HTTP_CODE-E1015";
	public static final String E1015_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1015";

	public static final String E1016_ERROR_CODE = "RH-HTTP_CODE-E1016";
	public static final String E1016_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1016";

	public static final String E1017_ERROR_CODE = "RH-HTTP_CODE-E1017";
	public static final String E1017_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1017";

	public static final String E1018_ERROR_CODE = "RH-HTTP_CODE-E1018";
	public static final String E1018_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1018";

	public static final String E1019_ERROR_CODE = "RH-HTTP_CODE-E1019";
	public static final String E1019_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1019";

	public static final String E1020_ERROR_CODE = "RH-HTTP_CODE-E1020";
	public static final String E1020_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1020";

	public static final String E1021_ERROR_CODE = "RH-HTTP_CODE-E1021";
	public static final String E1021_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1021";

	public static final String E1022_ERROR_CODE = "RH-HTTP_CODE-E1022";
	public static final String E1022_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1022";

	public static final String E1023_ERROR_CODE = "RH-HTTP_CODE-E1023";
	public static final String E1023_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1023";

	public static final String E1024_ERROR_CODE = "RH-HTTP_CODE-E1024";
	public static final String E1024_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1024";

	public static final String E1025_ERROR_CODE = "RH-HTTP_CODE-E1025";
	public static final String E1025_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1025";
	
	public static final String E1026_ERROR_CODE = "RH-HTTP_CODE-E1026";
	public static final String E1026_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1026";
	
	public static final String E1027_ERROR_CODE = "RH-HTTP_CODE-E1027";
	public static final String E1027_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1027";

	public static final String E1029_ERROR_CODE = "RH-HTTP_CODE-E1029";
	public static final String E1029_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1029";

	public static final String E1030_ERROR_CODE = "RH-HTTP_CODE-E1030";
	public static final String E1030_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1030";

	public static final String E1032_ERROR_CODE = "RH-HTTP_CODE-E1032";
	public static final String E1032_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1032";
	
	public static final String E1033_ERROR_CODE = "RH-HTTP_CODE-E1033";
	public static final String E1033_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1033";
	
	public static final String E1034_ERROR_CODE = "RH-HTTP_CODE-E1034";
	public static final String E1034_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1034";
	
	public static final String E1035_ERROR_CODE = "RH-HTTP_CODE-E1035";
	public static final String E1035_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1035";
	
	public static final String E1036_ERROR_CODE = "RH-HTTP_CODE-E1036";
	public static final String E1036_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1036";

	public static final String E1037_ERROR_CODE = "RH-HTTP_CODE-E1037";
	public static final String E1037_ERROR_DESCRIPTION = "RH-HTTP_DESCRIPTION-E1037";

}
