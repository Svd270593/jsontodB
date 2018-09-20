package com.cricket.stats.requests;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="playerbatting")
public class PlayerBatting {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    
    private Long id;
	private String playername;
    private String team;
    private int mat;
    private int inns;
    private int no;
    private int runs;
    private int balls;
    private int ave;
    private int sr;
    private int hs;
    private int hundreds;
    private int seventyfive;
    private int fifty;
    private int twentyfive;
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
    public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getInns() {
		return inns;
	}

	public void setInns(int inns) {
		this.inns = inns;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getBalls() {
		return balls;
	}

	public void setBalls(int balls) {
		this.balls = balls;
	}

	public int getAve() {
		return ave;
	}

	public void setAve(int ave) {
		this.ave = ave;
	}

	public int getSr() {
		return sr;
	}

	public void setSr(int sr) {
		this.sr = sr;
	}

	public int getHs() {
		return hs;
	}

	public void setHs(int hs) {
		this.hs = hs;
	}

	public int getHundreds() {
		return hundreds;
	}

	public void setHundreds(int hundreds) {
		this.hundreds = hundreds;
	}

	public int getSeventyfive() {
		return seventyfive;
	}

	public void setSeventyfive(int seventyfive) {
		this.seventyfive = seventyfive;
	}

	public int getFifty() {
		return fifty;
	}

	public void setFifty(int fifty) {
		this.fifty = fifty;
	}

	public int getTwentyfive() {
		return twentyfive;
	}

	public void setTwentyfive(int twentyfive) {
		this.twentyfive = twentyfive;
	}

	public int getZeros() {
		return zeros;
	}

	public void setZeros(int zeros) {
		this.zeros = zeros;
	}

	public int getFours() {
		return fours;
	}

	public void setFours(int fours) {
		this.fours = fours;
	}

	public int getSixes() {
		return sixes;
	}

	public void setSixes(int sixes) {
		this.sixes = sixes;
	}

	private int zeros;
    private int fours;
    private int sixes;

    public PlayerBatting() {}
}
