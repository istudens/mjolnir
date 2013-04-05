/*
 * JBoss, Home of Professional Open Source.
 * Copyright (c) 2013, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.mjolnir;

import org.jboss.mjolnir.authentication.GithubOrganization;
import org.jboss.mjolnir.util.GithubParser;

import java.util.Set;

/**
 * Main class to be used for this project. In time, we might not need a Main class.
 *
 * @author: navssurtani
 * @since: 0.1
 */
public class Main {

    private static final String XML_DATA = "/github-team-data.xml";

    public static void main(String[] args) {
        GithubParser parser = GithubParser.getInstance();
        Set<GithubOrganization> organizations = parser.parse(XML_DATA);
        System.out.println("List size: " + organizations.size());
        for (GithubOrganization o : organizations) {
            System.out.println(o.toString());
        }
    }


}
