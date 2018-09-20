/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.games.pathfinding;

import com.badlogic.gdx.ai.pfa.Heuristic;

/**
 *
 * @author aluno
 */
public class HeuristicaEuclidiana implements Heuristic<TileNode>{
    
    @Override
    public float estimate(TileNode n, TileNode n1) {
        float dx = Math.abs(n.getPosition().x - n1.getPosition().x);
        float dy = Math.abs(n.getPosition().y - n1.getPosition().y);
        return (float) ((Math.sqrt((dx*dx) + (dy*dy)))/32);
    }

}
