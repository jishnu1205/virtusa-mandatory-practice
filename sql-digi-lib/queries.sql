
-- select s.name, b.title, i.issueDate from issuedBooks i join students s on i.sID = s.sID join books b on i.bID = b.bID
-- where i.returnDate is null and i.issueDate < date_sub(curdate(), interval 14 day);


-- select b.category, count(*) as totalbooks from issuedBooks i join books b on i.bID = b.bID group by b.category order by totalbooks desc;



delete from students where sID not in (select distinct sID from issuedBooks) and joining < date_sub(curdate(), interval 3 year);