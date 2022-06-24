package firstproject.model.entity;

import java.security.Timestamp;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "buku")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(
        name = "buku_id_seq",
        sequenceName = "buku_id_seq",
        allocationSize = 1,
        initialValue = 2)
public class Buku {
    
    @Id
    @GeneratedValue(generator = "buku_id_seq")
    private String id;
    @Column(name = "nama_buku")
    private String namaBuku;
    @Column(name = "harga_buku")
    private String hargaBuku;
    private String author;
    @Column(name = "tanggal_terbit")
    private String tanggalTerbit;
    @Column(name = "d_pgun_rekam")
    private Timestamp dPgunRekam;

}


// CREATE SEQUENCE buku_id_seq;
// ALTER TABLE public.buku ALTER COLUMN id SET DEFAULT nextval('buku_id_seq'::regclass);
