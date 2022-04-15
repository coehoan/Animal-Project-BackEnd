SELECT * FROM Shelter;
SELECT * FROM KindDto;

SELECT * FROM Sido;
SELECT * FROM Sigungu;

SELECT DISTINCT careNm FROM Shelter;

SELECT kindCd FROM KindDto;

-- 시군구랑 시도 LEFT OUTER JOIN
-- 보호소도 LEFT OUTER JOIN
SELECT st.careRegNo
FROM Sigungu sg
LEFT OUTER JOIN Sido si ON sg.uprCd = si.orgCd
LEFT OUTER JOIN Shelter st ON sg.id = st.id;

SELECT sg.id, sg.orgCd, sg.orgdownNm, sg.uprCd
FROM Sigungu sg
LEFT OUTER JOIN Sido si ON sg.uprCd = si.orgCd;

SELECT st.id, st.careNm, st.careRegNo
FROM Sigungu sg
LEFT OUTER JOIN Shelter st ON sg.id = st.id;

SELECT * FROM KindDto WHERE kindCd;