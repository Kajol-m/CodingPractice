SELECT b.Continent,FLOOR(AVG(a.Population))
FROM City a
INNER JOIN Country b ON a.CountryCode=b.Code
GROUP BY b.Continent;
