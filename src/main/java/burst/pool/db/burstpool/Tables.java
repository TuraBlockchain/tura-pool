/*
 * This file is generated by jOOQ.
 */
package burst.pool.db.burstpool;


import burst.pool.db.burstpool.tables.Bestsubmissions;
import burst.pool.db.burstpool.tables.Minerdeadlines;
import burst.pool.db.burstpool.tables.Miners;
import burst.pool.db.burstpool.tables.Poolstate;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in BURSTPOOL
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>BURSTPOOL.BESTSUBMISSIONS</code>.
     */
    public static final Bestsubmissions BESTSUBMISSIONS = burst.pool.db.burstpool.tables.Bestsubmissions.BESTSUBMISSIONS;

    /**
     * The table <code>BURSTPOOL.MINERDEADLINES</code>.
     */
    public static final Minerdeadlines MINERDEADLINES = burst.pool.db.burstpool.tables.Minerdeadlines.MINERDEADLINES;

    /**
     * The table <code>BURSTPOOL.MINERS</code>.
     */
    public static final Miners MINERS = burst.pool.db.burstpool.tables.Miners.MINERS;

    /**
     * The table <code>BURSTPOOL.POOLSTATE</code>.
     */
    public static final Poolstate POOLSTATE = burst.pool.db.burstpool.tables.Poolstate.POOLSTATE;
}