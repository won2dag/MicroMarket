package vn.aptech.micro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.aptech.micro.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
