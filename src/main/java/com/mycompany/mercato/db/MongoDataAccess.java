package com.mycompany.mercato.db;

import com.mycompany.mercato.allenatore.AllenatoreInterface;
import com.mycompany.mercato.amministratoreDelegato.AmministratoreDelegatoInterface;
import com.mycompany.mercato.amministratoreSquadra.AmministratoreSquadraInterface;
import com.mycompany.mercato.amministratoresSistema.AmministratoreSistemaInterface;
import com.mycompany.mercato.osservatore.OsservatoreInterface;

/**
 *
 * @author tony_
 */
public class MongoDataAccess implements AmministratoreSistemaInterface, AmministratoreDelegatoInterface, AmministratoreSquadraInterface,
                                        AllenatoreInterface, OsservatoreInterface{
    
}
