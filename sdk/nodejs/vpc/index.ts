// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export * from "./bgpGroup";
export * from "./bgpNetwork";
export * from "./bgpPeer";
export * from "./commonBandwithPackage";
export * from "./commonBandwithPackageAttachment";
export * from "./dhcpOptionsSet";
export * from "./dhcpOptionsSetAttachment";
export * from "./flowLog";
export * from "./forwardEntry";
export * from "./getBgpGroups";
export * from "./getBgpNetworks";
export * from "./getBgpPeers";
export * from "./getCommonBandwidthPackages";
export * from "./getDhcpOptionsSets";
export * from "./getEnhancedNatAvailableZones";
export * from "./getForwardEntries";
export * from "./getHavips";
export * from "./getIpsecServers";
export * from "./getIpv4Gateways";
export * from "./getIpv6Addresses";
export * from "./getIpv6EgressRules";
export * from "./getIpv6Gateways";
export * from "./getIpv6InternetBandwidths";
export * from "./getNatGateways";
export * from "./getNatIpCidrs";
export * from "./getNatIps";
export * from "./getNetworkAcls";
export * from "./getNetworks";
export * from "./getPbrRouteEntries";
export * from "./getPrefixLists";
export * from "./getRouteEntries";
export * from "./getRouteTables";
export * from "./getRouterInterfaces";
export * from "./getSnatEntries";
export * from "./getSslVpnClientCerts";
export * from "./getSslVpnServers";
export * from "./getSwitches";
export * from "./getTrafficMirrorFilterEgressRules";
export * from "./getTrafficMirrorFilterIngressRules";
export * from "./getTrafficMirrorFilters";
export * from "./getTrafficMirrorService";
export * from "./getTrafficMirrorSessions";
export * from "./getVpcFlowLogs";
export * from "./havip";
export * from "./havipAttachment";
export * from "./ipv4Gateway";
export * from "./ipv6EgressRule";
export * from "./ipv6Gateway";
export * from "./ipv6InternetBandwidth";
export * from "./natGateway";
export * from "./natIp";
export * from "./natIpCidr";
export * from "./network";
export * from "./networkAcl";
export * from "./networkAclAttachment";
export * from "./networkAclEntries";
export * from "./networkInterface";
export * from "./networkInterfaceAttachment";
export * from "./prefixList";
export * from "./routeEntry";
export * from "./routeTable";
export * from "./routeTableAttachment";
export * from "./routerInterface";
export * from "./routerInterfaceConnection";
export * from "./snatEntry";
export * from "./subnet";
export * from "./switch";
export * from "./trafficMirrorFilter";
export * from "./trafficMirrorFilterEgressRule";
export * from "./trafficMirrorFilterIngressRule";
export * from "./trafficMirrorSession";
export * from "./vbrHa";

// Import resources to register:
import { BgpGroup } from "./bgpGroup";
import { BgpNetwork } from "./bgpNetwork";
import { BgpPeer } from "./bgpPeer";
import { CommonBandwithPackage } from "./commonBandwithPackage";
import { CommonBandwithPackageAttachment } from "./commonBandwithPackageAttachment";
import { DhcpOptionsSet } from "./dhcpOptionsSet";
import { DhcpOptionsSetAttachment } from "./dhcpOptionsSetAttachment";
import { FlowLog } from "./flowLog";
import { ForwardEntry } from "./forwardEntry";
import { HAVip } from "./havip";
import { HAVipAttachment } from "./havipAttachment";
import { Ipv4Gateway } from "./ipv4Gateway";
import { Ipv6EgressRule } from "./ipv6EgressRule";
import { Ipv6Gateway } from "./ipv6Gateway";
import { Ipv6InternetBandwidth } from "./ipv6InternetBandwidth";
import { NatGateway } from "./natGateway";
import { NatIp } from "./natIp";
import { NatIpCidr } from "./natIpCidr";
import { Network } from "./network";
import { NetworkAcl } from "./networkAcl";
import { NetworkAclAttachment } from "./networkAclAttachment";
import { NetworkAclEntries } from "./networkAclEntries";
import { NetworkInterface } from "./networkInterface";
import { NetworkInterfaceAttachment } from "./networkInterfaceAttachment";
import { PrefixList } from "./prefixList";
import { RouteEntry } from "./routeEntry";
import { RouteTable } from "./routeTable";
import { RouteTableAttachment } from "./routeTableAttachment";
import { RouterInterface } from "./routerInterface";
import { RouterInterfaceConnection } from "./routerInterfaceConnection";
import { SnatEntry } from "./snatEntry";
import { Subnet } from "./subnet";
import { Switch } from "./switch";
import { TrafficMirrorFilter } from "./trafficMirrorFilter";
import { TrafficMirrorFilterEgressRule } from "./trafficMirrorFilterEgressRule";
import { TrafficMirrorFilterIngressRule } from "./trafficMirrorFilterIngressRule";
import { TrafficMirrorSession } from "./trafficMirrorSession";
import { VbrHa } from "./vbrHa";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:vpc/bgpGroup:BgpGroup":
                return new BgpGroup(name, <any>undefined, { urn })
            case "alicloud:vpc/bgpNetwork:BgpNetwork":
                return new BgpNetwork(name, <any>undefined, { urn })
            case "alicloud:vpc/bgpPeer:BgpPeer":
                return new BgpPeer(name, <any>undefined, { urn })
            case "alicloud:vpc/commonBandwithPackage:CommonBandwithPackage":
                return new CommonBandwithPackage(name, <any>undefined, { urn })
            case "alicloud:vpc/commonBandwithPackageAttachment:CommonBandwithPackageAttachment":
                return new CommonBandwithPackageAttachment(name, <any>undefined, { urn })
            case "alicloud:vpc/dhcpOptionsSet:DhcpOptionsSet":
                return new DhcpOptionsSet(name, <any>undefined, { urn })
            case "alicloud:vpc/dhcpOptionsSetAttachment:DhcpOptionsSetAttachment":
                return new DhcpOptionsSetAttachment(name, <any>undefined, { urn })
            case "alicloud:vpc/flowLog:FlowLog":
                return new FlowLog(name, <any>undefined, { urn })
            case "alicloud:vpc/forwardEntry:ForwardEntry":
                return new ForwardEntry(name, <any>undefined, { urn })
            case "alicloud:vpc/hAVip:HAVip":
                return new HAVip(name, <any>undefined, { urn })
            case "alicloud:vpc/hAVipAttachment:HAVipAttachment":
                return new HAVipAttachment(name, <any>undefined, { urn })
            case "alicloud:vpc/ipv4Gateway:Ipv4Gateway":
                return new Ipv4Gateway(name, <any>undefined, { urn })
            case "alicloud:vpc/ipv6EgressRule:Ipv6EgressRule":
                return new Ipv6EgressRule(name, <any>undefined, { urn })
            case "alicloud:vpc/ipv6Gateway:Ipv6Gateway":
                return new Ipv6Gateway(name, <any>undefined, { urn })
            case "alicloud:vpc/ipv6InternetBandwidth:Ipv6InternetBandwidth":
                return new Ipv6InternetBandwidth(name, <any>undefined, { urn })
            case "alicloud:vpc/natGateway:NatGateway":
                return new NatGateway(name, <any>undefined, { urn })
            case "alicloud:vpc/natIp:NatIp":
                return new NatIp(name, <any>undefined, { urn })
            case "alicloud:vpc/natIpCidr:NatIpCidr":
                return new NatIpCidr(name, <any>undefined, { urn })
            case "alicloud:vpc/network:Network":
                return new Network(name, <any>undefined, { urn })
            case "alicloud:vpc/networkAcl:NetworkAcl":
                return new NetworkAcl(name, <any>undefined, { urn })
            case "alicloud:vpc/networkAclAttachment:NetworkAclAttachment":
                return new NetworkAclAttachment(name, <any>undefined, { urn })
            case "alicloud:vpc/networkAclEntries:NetworkAclEntries":
                return new NetworkAclEntries(name, <any>undefined, { urn })
            case "alicloud:vpc/networkInterface:NetworkInterface":
                return new NetworkInterface(name, <any>undefined, { urn })
            case "alicloud:vpc/networkInterfaceAttachment:NetworkInterfaceAttachment":
                return new NetworkInterfaceAttachment(name, <any>undefined, { urn })
            case "alicloud:vpc/prefixList:PrefixList":
                return new PrefixList(name, <any>undefined, { urn })
            case "alicloud:vpc/routeEntry:RouteEntry":
                return new RouteEntry(name, <any>undefined, { urn })
            case "alicloud:vpc/routeTable:RouteTable":
                return new RouteTable(name, <any>undefined, { urn })
            case "alicloud:vpc/routeTableAttachment:RouteTableAttachment":
                return new RouteTableAttachment(name, <any>undefined, { urn })
            case "alicloud:vpc/routerInterface:RouterInterface":
                return new RouterInterface(name, <any>undefined, { urn })
            case "alicloud:vpc/routerInterfaceConnection:RouterInterfaceConnection":
                return new RouterInterfaceConnection(name, <any>undefined, { urn })
            case "alicloud:vpc/snatEntry:SnatEntry":
                return new SnatEntry(name, <any>undefined, { urn })
            case "alicloud:vpc/subnet:Subnet":
                return new Subnet(name, <any>undefined, { urn })
            case "alicloud:vpc/switch:Switch":
                return new Switch(name, <any>undefined, { urn })
            case "alicloud:vpc/trafficMirrorFilter:TrafficMirrorFilter":
                return new TrafficMirrorFilter(name, <any>undefined, { urn })
            case "alicloud:vpc/trafficMirrorFilterEgressRule:TrafficMirrorFilterEgressRule":
                return new TrafficMirrorFilterEgressRule(name, <any>undefined, { urn })
            case "alicloud:vpc/trafficMirrorFilterIngressRule:TrafficMirrorFilterIngressRule":
                return new TrafficMirrorFilterIngressRule(name, <any>undefined, { urn })
            case "alicloud:vpc/trafficMirrorSession:TrafficMirrorSession":
                return new TrafficMirrorSession(name, <any>undefined, { urn })
            case "alicloud:vpc/vbrHa:VbrHa":
                return new VbrHa(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "vpc/bgpGroup", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/bgpNetwork", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/bgpPeer", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/commonBandwithPackage", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/commonBandwithPackageAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/dhcpOptionsSet", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/dhcpOptionsSetAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/flowLog", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/forwardEntry", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/hAVip", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/hAVipAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/ipv4Gateway", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/ipv6EgressRule", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/ipv6Gateway", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/ipv6InternetBandwidth", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/natGateway", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/natIp", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/natIpCidr", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/network", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/networkAcl", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/networkAclAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/networkAclEntries", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/networkInterface", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/networkInterfaceAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/prefixList", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/routeEntry", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/routeTable", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/routeTableAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/routerInterface", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/routerInterfaceConnection", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/snatEntry", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/subnet", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/switch", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/trafficMirrorFilter", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/trafficMirrorFilterEgressRule", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/trafficMirrorFilterIngressRule", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/trafficMirrorSession", _module)
pulumi.runtime.registerResourceModule("alicloud", "vpc/vbrHa", _module)
