/*
 * #%L
 * Alfresco Repository
 * %%
 * Copyright (C) 2005 - 2016 Alfresco Software Limited
 * %%
 * This file is part of the Alfresco software. 
 * If the software was purchased under a paid Alfresco license, the terms of 
 * the paid license agreement will prevail.  Otherwise, the software is 
 * provided under the following open source license terms:
 * 
 * Alfresco is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Alfresco is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Alfresco. If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */
package org.alfresco.repo.search;

import org.alfresco.repo.search.impl.lucene.fts.FTSIndexerAware;

/**
 * Add support for FTS indexing
 * 
 * @author andyh
 */
public interface BackgroundIndexerAware extends SupportsBackgroundIndexing
{
    /**
     * Register call back handler when the indexing chunk is done
     * 
     * @param callBack FTSIndexerAware
     */
    public void registerCallBack(FTSIndexerAware callBack);

    /**
     * Peform a chunk of background FTS (and other non atomic property) indexing
     * 
     * @param i int
     * @return - the number of docs updates
     */
    public int updateFullTextSearch(int i);

    
}
