package com.elastic.search;

/**
 * 
 *
 */
public class Constant {

	private Constant() {

	}


	public static final String IGNORE_INPUT = "ignore_input";
	
	public static final String MD5FORMAT = "%032X";
	
	public static final String UTC_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZ";

	public static final String FIELD_VALUE_VALIDATION = "field_value_validation";
	public static final String MIN_LENGTH = "min_length";
	public static final String MAX_LENGTH = "max_length";
	public static final String IS_MANDATORY = "is_mandatory";
	
	public static final String CONTENT_TYPE	= "Content-Type";
	
	public static final String INCLUDE_PREVIOUS_DATA = "include_previous_data";
	public static final String NAME_SPACE = "name_space";
	public static final String ACTIVITY = "Activity";
	public static final String SUCCESS = "success";
	public static final String COPROCESSOR_CLASS_NAME = "coprocessor_class_name";
	public static final String COPROCESSOR_PATH = "coprocessor_path";
	public static final String TESSERACT_URL = "tesseract-url";
	public static final String METHOD = "method";
	public static final String URL = "url";
	public static final String MESSAGE = "message";
	public static final String ERROR = "error";
	public static final String RESULT = "Result";
	
	public static final String CODE = "code";
	public static final String STATUS = "status";
	public static final String TOTAL_HITS = "totalHits";

	public static final String ROW_KEY = "row_key";
	public static final String REFRESH_CACHE_URL = "POST/refreshcache";
	public static final String INITIALIZE_APPLICATION = "POST/initializeApplication";

	public static final String JSON_OBJECT = "json_object";
	public static final String JSON_ARRAY = "json_array";
	public static final String INTEGER = "integer";
	public static final String LONG = "long";
	public static final String STRING = "string";
	public static final String BOOLEAN = "boolean";
	public static final String DOUBLE = "double";
	public static final String DATE = "date";
	public static final String DATETIME = "datetime";
	
	public static final String KEY = "key";

	public static final String UPDATE = "update";
	public static final String INDEX = "index";
	
	public static final String IS_INDEX = "is_index";

	public static final String DATA = "data";

	public static final String COLUMN_TYPE = "column_type";
	public static final String COLUMN_FAMILY = "column_family";
	public static final String COLUMN_NAME = "column_name";
	public static final String COLUMN_VALUE = "column_value";
	public static final String JSON_KEY = "json_key";
	public static final String TYPE = "type";
	public static final String TABLE_NAME = "table_name";
	public static final String ON_SUCCESS = "on_success";
	public static final String PROCESSING_TYPE = "processing_type";
	public static final String OPERATION_TYPE = "operation_type";
	public static final String VALIDATIONS = "validations";
	public static final String COLUMN_SCHEMA = "column_schema";
	public static final String ENDPOINT = "endpoint";
	public static final String REFERENCE_TABLE = "reference_table";
	public static final String  REVERSE_COLUMN_PATTERN = "reverse_column_pattern";
	public static final String  IS_OBJECT_ARRAY = "is_object_array";
	public static final String REFERENCE_COLUMN_SCHEMA = "reference_column_schema";

	public static final String GET = "GET";
	public static final String PUT = "PUT";
	public static final String SCAN = "SCAN";
	public static final String DELETE = "DELETE";
	public static final String POST = "POST";
	public static final String SNAPSHOT = "SNAPSHOT";

	public static final String CONTENT_TYPE_JSON = "application/json";

	public static final String BATCH = "batch";
	public static final String SINGLE = "single";

	public static final String STATIC = "static";
	public static final String DYNAMIC = "dynamic";

	public static final String[] CONFIGURATION_DETAIL_REQUIRED_FIELD_IN_CONFIGURATION = { "processing_type",
			"operation_type", "validations", "on_success" };

	public static final String CONFIGURATION = "configuration";
	
	public static final String HBASE_CONFIGURATION_TABLE = "hbase.configuration.table";

	public static final String C = "c";

	public static final String START_TIME = "start_time";
	public static final String END_TIME = "end_time";
	
	public static final String DOC = "doc";
	public static final String DOC_AS_UPSERT = "doc_as_upsert";
	public static final String ELASTIC_SEARCH_PROTOCOL = "elastic-search.protocol";
	public static final String ELASTIC_SEARCH_HOST = "elastic-search.host";
	public static final String ELASTIC_SEARCH_PORT = "elastic-search.port";
	public static final String RISK_CANVAS = "risk-canvas";
	
	public static final String _ID = "_id";
	public static final String _UPDATE = "_update";
	public static final String _INDEX = "_index";
	public static final String _BULK = "_bulk";
	public static final String _MAPPING = "_mapping";
	public static final String _REFRESH = "_refresh";
	public static final String COUNT = "count";
	public static final String AGGREGATIONS = "aggregations";
	public static final String HITS = "hits";
	public static final String TOTAL = "total";
	public static final String _SOURCE = "_source";
	public static final String _TYPE = "_type";
	public static final String _NESTED = "_nested";
	public static final String INNER_HITS = "inner_hits";
	public static final String META = "meta";
	public static final String GROUP_BY = "group_by";
	public static final String BUCKETS = "buckets";
	public static final String DOC_COUNT = "doc_count";
	public static final String SUM = "sum";
	public static final String AVG = "avg";
	public static final String VALUE = "value";
	public static final String OFFSET = "offset";
	public static final String LANG = "lang";
	public static final String PAINLESS = "painless";
	public static final String SCRIPT = "script";
	public static final String INLINE = "inline";
	public static final String CTX_SOURCE = "ctx._source.";
	
	
	public static final String ID = "id";
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";
	public static final String CREATED_DATE = "createdDate";

	public static final String ERROR_WHILE_HBASE_CONNECTION = "Error while returning Hbase Connection";
	public static final String ERROR_WHILE_CLOSING_TABLE = "Error while closing table ";
	public static final String ERROR_WHILE_GETTING_BODY_FROM_REQUEST = "Error while getting body from Request";
	public static final String SOMETHING_BAD_HAPPEN_AT_SERVER = "Something Bad Happen at Server";

	public static final String OBJECT_SUCCESSFULLY_RETRIEVED = "Object successfully Retrieved";
	public static final String OBJECT_NOT_FOUND_IN_DATABASE = "Object Not Found In Database";
	public static final String DATA_SUCCESSFULLY_SEND = "Data Successfully Send";

	public static final String STATUS_CODE_SUCCESSFUL = "200";
	public static final String STATUS_CODE_FAILURE = "500";
	public static final String COL_ATTACHMENTID = "attachmentId";

	public static final String ELASTIC_URL = "http://localhost:9200";

	public static final String JSON_FILE_PATH = "E:\\Documents\\db_scripts\\json_ES";
	public static final String ES_INDEX_NAME = "ndi_data";
	
	public static final String SEARCH_QUERY = "_search";
	
	public static final String IS_PRETTY = "&pretty";
}
