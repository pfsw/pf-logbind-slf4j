// ===========================================================================
// CONTENT  : CLASS Slf4jLoggerFactory
// AUTHOR   : Manfred Duchrow
// VERSION  : 1.0 - 17/05/2020
// HISTORY  :
//  17/05/2020  mdu  CREATED
//
// Copyright (c) 2020, by MDCS. All rights reserved.
// ===========================================================================
package org.pfsw.logbind.slf4j;

import org.pfsw.logging.Logger;
import org.pfsw.logging.LoggerFactory;

/**
 * This factory can be registered with the PF logging framework to support
 * binding of all PF logging output to Simple Logging Facade for Java (SLF4J) loggers.
 * <p>
 * In order to activate the binding, this library must be on the classpath
 * and system property <strong>org.pfsw.logging.binding=SLF4J</strong> set.  
 *
 * @author Manfred Duchrow
 * @version 1.0
 */
public class Slf4jLoggerFactory implements LoggerFactory
{
  public Slf4jLoggerFactory()
  {
    super();
  }

  @Override
  public String getName()
  {
    return "SLF4J";
  }

  @Override
  public Logger createLogger()
  {
    return getLogger("");
  }

  @Override
  public Logger getLogger(Class<?> clazz)
  {
    return new Slf4jLoggerAdapter(clazz);
  }

  @Override
  public Logger getLogger(String loggerName)
  {
    return new Slf4jLoggerAdapter(loggerName);
  }
}
