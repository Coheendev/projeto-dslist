package com.projetoSpringBoot.dslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

	@EmbeddedId
	private com.projetoSpringBoot.dslist.entities.BelongingPK id = new com.projetoSpringBoot.dslist.entities.BelongingPK();

	private Integer position;

	public void setGame(com.projetoSpringBoot.dslist.entities.Game game) {
		id.setGame(game);
	}

	public com.projetoSpringBoot.dslist.entities.Game getGame() {
		return id.getGame();
	}

	public void setList(com.projetoSpringBoot.dslist.entities.GameList list) {
		id.setList(list);
	}

	public com.projetoSpringBoot.dslist.entities.GameList getList() {
		return id.getList();
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belonging other = (Belonging) obj;
		return Objects.equals(id, other.id);
	}
}
