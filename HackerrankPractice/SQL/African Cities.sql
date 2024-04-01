SELECT DISTINCT a.Name FROM CITY a
JOIN COUNTRY b ON a.CountryCode=b.Code
WHERE b.Continent='Africa';
