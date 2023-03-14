package fr.solutec.re.dao;

import fr.solutec.re.entites.Adresse;
import fr.solutec.re.entites.Lieu;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class LieuDAO {

    private JdbcTemplate jdbcTemplate;

    public LieuDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void create (Lieu lieu){
        jdbcTemplate.update(
                "INSERT INTO LIEU(nom) VALUES (?)",
                lieu.getNom()
        );

    }

    public Set<Lieu> readALL() {
        List<Lieu> lieux = new ArrayList<>();
        String QUERY = "SELECT * FROM LIEU l JOIN ADRESSE a ON l.adresse_id = a.id";
        List<Map<String,Object>> items = jdbcTemplate.queryForList(QUERY);
        for (Map<String, Object> item: items) {
            Lieu lieu = new Lieu();
            Adresse adresse = new Adresse();
            lieu.setId((int)item.get("id"));
            lieu.setNom((String)item.get("nom"));
            adresse.setId((int)item.get("adresse_id"));
            adresse.setNumero((int)item.get("numero"));
            adresse.setRue((String)item.get("rue"));
            adresse.setCodePostal((int)item.get("code_postal"));
            adresse.setVille((String)item.get("ville"));
            lieu.setAdresse(adresse);

            lieux.add(lieu);
        }
        return Set.copyOf(lieux);
    }
}