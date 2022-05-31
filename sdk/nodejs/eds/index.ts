// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export * from "./command";
export * from "./desktop";
export * from "./ecdPolicyGroup";
export * from "./getBundles";
export * from "./getCommands";
export * from "./getDesktops";
export * from "./getImages";
export * from "./getNasFileSystems";
export * from "./getNetworkPackages";
export * from "./getPolicyGroups";
export * from "./getSimpleOfficeSites";
export * from "./getSnapshots";
export * from "./getUsers";
export * from "./image";
export * from "./nasFileSystem";
export * from "./networkPackage";
export * from "./simpleOfficeSite";
export * from "./snapshot";
export * from "./user";

// Import resources to register:
import { Command } from "./command";
import { Desktop } from "./desktop";
import { EcdPolicyGroup } from "./ecdPolicyGroup";
import { Image } from "./image";
import { NasFileSystem } from "./nasFileSystem";
import { NetworkPackage } from "./networkPackage";
import { SimpleOfficeSite } from "./simpleOfficeSite";
import { Snapshot } from "./snapshot";
import { User } from "./user";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:eds/command:Command":
                return new Command(name, <any>undefined, { urn })
            case "alicloud:eds/desktop:Desktop":
                return new Desktop(name, <any>undefined, { urn })
            case "alicloud:eds/ecdPolicyGroup:EcdPolicyGroup":
                return new EcdPolicyGroup(name, <any>undefined, { urn })
            case "alicloud:eds/image:Image":
                return new Image(name, <any>undefined, { urn })
            case "alicloud:eds/nasFileSystem:NasFileSystem":
                return new NasFileSystem(name, <any>undefined, { urn })
            case "alicloud:eds/networkPackage:NetworkPackage":
                return new NetworkPackage(name, <any>undefined, { urn })
            case "alicloud:eds/simpleOfficeSite:SimpleOfficeSite":
                return new SimpleOfficeSite(name, <any>undefined, { urn })
            case "alicloud:eds/snapshot:Snapshot":
                return new Snapshot(name, <any>undefined, { urn })
            case "alicloud:eds/user:User":
                return new User(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "eds/command", _module)
pulumi.runtime.registerResourceModule("alicloud", "eds/desktop", _module)
pulumi.runtime.registerResourceModule("alicloud", "eds/ecdPolicyGroup", _module)
pulumi.runtime.registerResourceModule("alicloud", "eds/image", _module)
pulumi.runtime.registerResourceModule("alicloud", "eds/nasFileSystem", _module)
pulumi.runtime.registerResourceModule("alicloud", "eds/networkPackage", _module)
pulumi.runtime.registerResourceModule("alicloud", "eds/simpleOfficeSite", _module)
pulumi.runtime.registerResourceModule("alicloud", "eds/snapshot", _module)
pulumi.runtime.registerResourceModule("alicloud", "eds/user", _module)
