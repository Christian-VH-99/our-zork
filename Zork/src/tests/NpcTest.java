package tests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import items.Item;
import jugadores.Debilidad;
import jugadores.Npc;

public class NpcTest {

	static private Item it1;
	static private Item it2;
	static private Debilidad deb;
	static private Npc npc;

	@BeforeClass
	public static void before() {
		it1 = new Item("Agua", 'F', 'S', 10);
		it2 = new Item("Cerveza", 'F', 'S', 10);
		deb = new Debilidad(it2, "Uh! me encanta la cereveza, solo por esta vez te dejare pasar a la taverna", "");
		npc = new Npc("Borracho", 'M', "Borracho de todos los dias", "�Acaso pensaste pasar como si nada?!", deb, 'S');
	}

	@Test
	public void testAttackInvalido() {
		assertFalse(npc.attack(it1));// No sirvio porque quiere alcohol, no agua.
	}

	@Test
	public void testAttackValido() {
		assertTrue(npc.attack(it2)); // Le dio alcohol y paso a la taverna

	}

}
