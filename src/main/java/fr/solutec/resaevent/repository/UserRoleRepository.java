package fr.solutec.resaevent.repository;


import fr.solutec.re.entites.UserRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface UserRoleRepository extends CrudRepository<UserRole, Integer> {
}