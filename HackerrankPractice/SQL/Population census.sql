SELECT SUM(a.POPULATION) FROM CITY a, COUNTRY b
WHERE a.COUNTRYCODE = b.CODE
AND b.CONTINENT = "Asia";
