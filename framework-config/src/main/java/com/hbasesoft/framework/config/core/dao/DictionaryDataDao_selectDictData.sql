SELECT A.DICT_DATA_ID,
       A.DICT_CODE,
       A.DICT_DATA_NAME,
       A.DICT_DATA_VALUE,
       A.IS_FIXED,
       A.IS_CANCEL
  FROM T_SYS_DICTIONARY_DATA A
  WHERE
  	  A.DICT_CODE = :dictCode
  AND
  	  A.DICT_DATA_VALUE = :value