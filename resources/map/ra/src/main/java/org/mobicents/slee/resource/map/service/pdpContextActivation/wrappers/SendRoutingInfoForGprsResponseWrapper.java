/*
 * TeleStax, Open Source Cloud Communications  Copyright 2012.
 * and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
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

package org.mobicents.slee.resource.map.service.pdpContextActivation.wrappers;

import org.mobicents.protocols.ss7.map.api.primitives.GSNAddress;
import org.mobicents.protocols.ss7.map.api.primitives.MAPExtensionContainer;
import org.mobicents.protocols.ss7.map.api.service.pdpContextActivation.SendRoutingInfoForGprsResponse;

/**
 * 
 * @author sergey vetyutnev
 *
 */
public class SendRoutingInfoForGprsResponseWrapper extends PdpContextActivationMessageWrapper<SendRoutingInfoForGprsResponse> implements SendRoutingInfoForGprsResponse {

    private static final String EVENT_TYPE_NAME = "ss7.map.service.pdpContextActivation.SEND_ROUTING_INFO_FOR_GPRS_RESPONSE";

    public SendRoutingInfoForGprsResponseWrapper(MAPDialogPdpContextActivationWrapper mAPDialog, SendRoutingInfoForGprsResponse req) {
        super(mAPDialog, EVENT_TYPE_NAME, req);
    }

    @Override
    public GSNAddress getSgsnAddress() {
        return this.wrappedEvent.getSgsnAddress();
    }

    @Override
    public GSNAddress getGgsnAddress() {
        return this.wrappedEvent.getGgsnAddress();
    }

    @Override
    public Integer getMobileNotReachableReason() {
        return this.wrappedEvent.getMobileNotReachableReason();
    }

    @Override
    public MAPExtensionContainer getExtensionContainer() {
        return this.wrappedEvent.getExtensionContainer();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "SendRoutingInfoForGprsResponseWrapper [wrapped=" + this.wrappedEvent + "]";
    }

}