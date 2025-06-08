
package com.example.app;

import java.util.Collection;
import java.util.List;

/**
 * DwarvenGoldmineFacade provides a single interface through which users can operate the
 * subsystems.
 *
 * <p>This makes the goldmine easier to operate and cuts the dependencies from the goldmine user to
 * the subsystems.
 */
public class DwarvenGoldmineFacade {

    private final List<DwarvenMineWorker> workers;

    public DwarvenGoldmineFacade(){
        this.workers = List.of(
                new DwarvenCartOperator(),
                new DwarvenGoldDigger(),
                new DwarvenTunnelDigger()
        );
    }

  public void startNewDay() {
    makeActions(workers, DwarvenMineWorker.Action.WAKE_UP, DwarvenMineWorker.Action.GO_TO_MINE);
  }

  public void digOutGold() {
    makeActions(workers, DwarvenMineWorker.Action.WORK);
  }

  public void endDay() {
    makeActions(workers, DwarvenMineWorker.Action.GO_HOME, DwarvenMineWorker.Action.GO_TO_SLEEP);
  }

  private static void makeActions(
          Collection<DwarvenMineWorker> workers,
          DwarvenMineWorker.Action... actions
  ) {
    workers.forEach(worker -> worker.action(actions));
  }
}
