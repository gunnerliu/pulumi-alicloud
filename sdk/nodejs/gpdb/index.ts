// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export * from "./account";
export * from "./connection";
export * from "./elasticInstance";
export * from "./getAccounts";
export * from "./getInstances";
export * from "./getZones";
export * from "./instance";

// Import resources to register:
import { Account } from "./account";
import { Connection } from "./connection";
import { ElasticInstance } from "./elasticInstance";
import { Instance } from "./instance";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:gpdb/account:Account":
                return new Account(name, <any>undefined, { urn })
            case "alicloud:gpdb/connection:Connection":
                return new Connection(name, <any>undefined, { urn })
            case "alicloud:gpdb/elasticInstance:ElasticInstance":
                return new ElasticInstance(name, <any>undefined, { urn })
            case "alicloud:gpdb/instance:Instance":
                return new Instance(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "gpdb/account", _module)
pulumi.runtime.registerResourceModule("alicloud", "gpdb/connection", _module)
pulumi.runtime.registerResourceModule("alicloud", "gpdb/elasticInstance", _module)
pulumi.runtime.registerResourceModule("alicloud", "gpdb/instance", _module)
