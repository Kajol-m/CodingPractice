/*
Enter your query here.
*/
SELECT a.id,b.age,a.coins_needed,a.power FROM Wands AS a
JOIN Wands_Property AS b ON a.code=b.code
WHERE a.coins_needed=(SELECT MIN(a1.coins_needed) FROM Wands AS a1
                   INNER JOIN Wands_Property AS b1 ON a1.code=b1.code
                   WHERE b1.is_evil=0 AND b.age=b1.age AND a.power=a1.power
                     )
ORDER BY a.power DESC, b.age DESC;
