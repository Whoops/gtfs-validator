package org.mobilitydata.gtfsvalidator.table;

import com.google.common.collect.ImmutableList;

/**
 * An interface to find loader classes for all GTFS tables.
 *
 * <p>An implementation of this interface ({@code DefaultTableRegistry}) is generated by the
 * annotation processor.
 */
public interface GtfsTableRegistry {
  /** Returns a list of loaders for all GTFS tables. */
  ImmutableList<GtfsTableDescriptor<?>> getTableDescriptors();
}
