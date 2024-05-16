/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.fatec.tp2.ativ5;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author Silvio Junior
 */
public class Principal {

    public static void main(String[] args) {
        FaturaService faturaService = new FaturaService();
        AnalyticsService analyticsService = new AnalyticsService();
        ContabilidadeService contabilidadeService = new ContabilidadeService();
        NotificacaoService notificacaoService = new NotificacaoService();
        
        PassagemPedagioSubject passagemPedagioSubject = new PassagemPedagioSubject();
        
        passagemPedagioSubject.register(faturaService);
        passagemPedagioSubject.register(analyticsService);
        passagemPedagioSubject.register(contabilidadeService);
        passagemPedagioSubject.register(notificacaoService);
        
        Cliente c1 = new Cliente("Fulano");
        Cliente c2 = new Cliente("Ciclano");
        
        Tag t1 = new Tag(123D, c1);
        Tag t2 = new Tag(321D, c1);
        Tag t3 = new Tag(657D, c2);
        
        PassagemPedagio p1 = new PassagemPedagio(t1, Date.from(Instant.now()), "ZZZ-1258", 12.99, 1);
        PassagemPedagio p2 = new PassagemPedagio(t1, Date.from(Instant.now()), "ZZZ-1258", 15.99, 5);
        PassagemPedagio p3 = new PassagemPedagio(t2, Date.from(Instant.now()), "CHD-8741", 4.50, 6);
        PassagemPedagio p4 = new PassagemPedagio(t3, Date.from(Instant.now()), "TRD-6998", 12.99, 1);
        
        passagemPedagioSubject.criarPedagio(p1);
        passagemPedagioSubject.criarPedagio(p2);
        passagemPedagioSubject.criarPedagio(p3);
        passagemPedagioSubject.criarPedagio(p4);

    }
}
