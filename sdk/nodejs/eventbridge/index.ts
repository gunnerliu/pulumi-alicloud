// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export * from "./eventBus";
export * from "./getEventBuses";
export * from "./getSchemaGroups";
export * from "./getService";
export * from "./schemaGroup";

// Import resources to register:
import { EventBus } from "./eventBus";
import { SchemaGroup } from "./schemaGroup";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:eventbridge/eventBus:EventBus":
                return new EventBus(name, <any>undefined, { urn })
            case "alicloud:eventbridge/schemaGroup:SchemaGroup":
                return new SchemaGroup(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "eventbridge/eventBus", _module)
pulumi.runtime.registerResourceModule("alicloud", "eventbridge/schemaGroup", _module)
