// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { AccountArgs, AccountState } from "./account";
export type Account = import("./account").Account;
export const Account: typeof import("./account").Account = null as any;
utilities.lazyLoad(exports, ["Account"], () => require("./account"));

export { AccountPrivilegeArgs, AccountPrivilegeState } from "./accountPrivilege";
export type AccountPrivilege = import("./accountPrivilege").AccountPrivilege;
export const AccountPrivilege: typeof import("./accountPrivilege").AccountPrivilege = null as any;
utilities.lazyLoad(exports, ["AccountPrivilege"], () => require("./accountPrivilege"));

export { BackupPolicyArgs, BackupPolicyState } from "./backupPolicy";
export type BackupPolicy = import("./backupPolicy").BackupPolicy;
export const BackupPolicy: typeof import("./backupPolicy").BackupPolicy = null as any;
utilities.lazyLoad(exports, ["BackupPolicy"], () => require("./backupPolicy"));

export { ClusterArgs, ClusterState } from "./cluster";
export type Cluster = import("./cluster").Cluster;
export const Cluster: typeof import("./cluster").Cluster = null as any;
utilities.lazyLoad(exports, ["Cluster"], () => require("./cluster"));

export { DatabaseArgs, DatabaseState } from "./database";
export type Database = import("./database").Database;
export const Database: typeof import("./database").Database = null as any;
utilities.lazyLoad(exports, ["Database"], () => require("./database"));

export { EndpointArgs, EndpointState } from "./endpoint";
export type Endpoint = import("./endpoint").Endpoint;
export const Endpoint: typeof import("./endpoint").Endpoint = null as any;
utilities.lazyLoad(exports, ["Endpoint"], () => require("./endpoint"));

export { EndpointAddressArgs, EndpointAddressState } from "./endpointAddress";
export type EndpointAddress = import("./endpointAddress").EndpointAddress;
export const EndpointAddress: typeof import("./endpointAddress").EndpointAddress = null as any;
utilities.lazyLoad(exports, ["EndpointAddress"], () => require("./endpointAddress"));

export { GetAccountsArgs, GetAccountsResult, GetAccountsOutputArgs } from "./getAccounts";
export const getAccounts: typeof import("./getAccounts").getAccounts = null as any;
export const getAccountsOutput: typeof import("./getAccounts").getAccountsOutput = null as any;
utilities.lazyLoad(exports, ["getAccounts","getAccountsOutput"], () => require("./getAccounts"));

export { GetClustersArgs, GetClustersResult, GetClustersOutputArgs } from "./getClusters";
export const getClusters: typeof import("./getClusters").getClusters = null as any;
export const getClustersOutput: typeof import("./getClusters").getClustersOutput = null as any;
utilities.lazyLoad(exports, ["getClusters","getClustersOutput"], () => require("./getClusters"));

export { GetDatabasesArgs, GetDatabasesResult, GetDatabasesOutputArgs } from "./getDatabases";
export const getDatabases: typeof import("./getDatabases").getDatabases = null as any;
export const getDatabasesOutput: typeof import("./getDatabases").getDatabasesOutput = null as any;
utilities.lazyLoad(exports, ["getDatabases","getDatabasesOutput"], () => require("./getDatabases"));

export { GetEndpointsArgs, GetEndpointsResult, GetEndpointsOutputArgs } from "./getEndpoints";
export const getEndpoints: typeof import("./getEndpoints").getEndpoints = null as any;
export const getEndpointsOutput: typeof import("./getEndpoints").getEndpointsOutput = null as any;
utilities.lazyLoad(exports, ["getEndpoints","getEndpointsOutput"], () => require("./getEndpoints"));

export { GetGlobalDatabaseNetworksArgs, GetGlobalDatabaseNetworksResult, GetGlobalDatabaseNetworksOutputArgs } from "./getGlobalDatabaseNetworks";
export const getGlobalDatabaseNetworks: typeof import("./getGlobalDatabaseNetworks").getGlobalDatabaseNetworks = null as any;
export const getGlobalDatabaseNetworksOutput: typeof import("./getGlobalDatabaseNetworks").getGlobalDatabaseNetworksOutput = null as any;
utilities.lazyLoad(exports, ["getGlobalDatabaseNetworks","getGlobalDatabaseNetworksOutput"], () => require("./getGlobalDatabaseNetworks"));

export { GetNodeClassesArgs, GetNodeClassesResult, GetNodeClassesOutputArgs } from "./getNodeClasses";
export const getNodeClasses: typeof import("./getNodeClasses").getNodeClasses = null as any;
export const getNodeClassesOutput: typeof import("./getNodeClasses").getNodeClassesOutput = null as any;
utilities.lazyLoad(exports, ["getNodeClasses","getNodeClassesOutput"], () => require("./getNodeClasses"));

export { GetParameterGroupsArgs, GetParameterGroupsResult, GetParameterGroupsOutputArgs } from "./getParameterGroups";
export const getParameterGroups: typeof import("./getParameterGroups").getParameterGroups = null as any;
export const getParameterGroupsOutput: typeof import("./getParameterGroups").getParameterGroupsOutput = null as any;
utilities.lazyLoad(exports, ["getParameterGroups","getParameterGroupsOutput"], () => require("./getParameterGroups"));

export { GetZonesArgs, GetZonesResult, GetZonesOutputArgs } from "./getZones";
export const getZones: typeof import("./getZones").getZones = null as any;
export const getZonesOutput: typeof import("./getZones").getZonesOutput = null as any;
utilities.lazyLoad(exports, ["getZones","getZonesOutput"], () => require("./getZones"));

export { GlobalDatabaseNetworkArgs, GlobalDatabaseNetworkState } from "./globalDatabaseNetwork";
export type GlobalDatabaseNetwork = import("./globalDatabaseNetwork").GlobalDatabaseNetwork;
export const GlobalDatabaseNetwork: typeof import("./globalDatabaseNetwork").GlobalDatabaseNetwork = null as any;
utilities.lazyLoad(exports, ["GlobalDatabaseNetwork"], () => require("./globalDatabaseNetwork"));

export { ParameterGroupArgs, ParameterGroupState } from "./parameterGroup";
export type ParameterGroup = import("./parameterGroup").ParameterGroup;
export const ParameterGroup: typeof import("./parameterGroup").ParameterGroup = null as any;
utilities.lazyLoad(exports, ["ParameterGroup"], () => require("./parameterGroup"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:polardb/account:Account":
                return new Account(name, <any>undefined, { urn })
            case "alicloud:polardb/accountPrivilege:AccountPrivilege":
                return new AccountPrivilege(name, <any>undefined, { urn })
            case "alicloud:polardb/backupPolicy:BackupPolicy":
                return new BackupPolicy(name, <any>undefined, { urn })
            case "alicloud:polardb/cluster:Cluster":
                return new Cluster(name, <any>undefined, { urn })
            case "alicloud:polardb/database:Database":
                return new Database(name, <any>undefined, { urn })
            case "alicloud:polardb/endpoint:Endpoint":
                return new Endpoint(name, <any>undefined, { urn })
            case "alicloud:polardb/endpointAddress:EndpointAddress":
                return new EndpointAddress(name, <any>undefined, { urn })
            case "alicloud:polardb/globalDatabaseNetwork:GlobalDatabaseNetwork":
                return new GlobalDatabaseNetwork(name, <any>undefined, { urn })
            case "alicloud:polardb/parameterGroup:ParameterGroup":
                return new ParameterGroup(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "polardb/account", _module)
pulumi.runtime.registerResourceModule("alicloud", "polardb/accountPrivilege", _module)
pulumi.runtime.registerResourceModule("alicloud", "polardb/backupPolicy", _module)
pulumi.runtime.registerResourceModule("alicloud", "polardb/cluster", _module)
pulumi.runtime.registerResourceModule("alicloud", "polardb/database", _module)
pulumi.runtime.registerResourceModule("alicloud", "polardb/endpoint", _module)
pulumi.runtime.registerResourceModule("alicloud", "polardb/endpointAddress", _module)
pulumi.runtime.registerResourceModule("alicloud", "polardb/globalDatabaseNetwork", _module)
pulumi.runtime.registerResourceModule("alicloud", "polardb/parameterGroup", _module)
