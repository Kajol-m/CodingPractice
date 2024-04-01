SELECT 
    IF(grade < 8, NULL, name) AS n,
    grade,
    marks
FROM 
    Students 
INNER JOIN 
    Grades ON marks BETWEEN min_mark AND max_mark
ORDER BY 
    grade DESC,
    name,
    CASE WHEN n IS NULL THEN marks END;
 
