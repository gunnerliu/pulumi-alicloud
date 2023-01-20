// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { GetNetworksArgs, GetNetworksResult, GetNetworksOutputArgs } from "./getNetworks";
export const getNetworks: typeof import("./getNetworks").getNetworks = null as any;
export const getNetworksOutput: typeof import("./getNetworks").getNetworksOutput = null as any;
utilities.lazyLoad(exports, ["getNetworks","getNetworksOutput"], () => require("./getNetworks"));

export { NetworkArgs, NetworkState } from "./network";
export type Network = import("./network").Network;
export const Network: typeof import("./network").Network = null as any;
utilities.lazyLoad(exports, ["Network"], () => require("./network"));

export { NetworkAttachmentArgs, NetworkAttachmentState } from "./networkAttachment";
export type NetworkAttachment = import("./networkAttachment").NetworkAttachment;
export const NetworkAttachment: typeof import("./networkAttachment").NetworkAttachment = null as any;
utilities.lazyLoad(exports, ["NetworkAttachment"], () => require("./networkAttachment"));

export { NetworkGrantArgs, NetworkGrantState } from "./networkGrant";
export type NetworkGrant = import("./networkGrant").NetworkGrant;
export const NetworkGrant: typeof import("./networkGrant").NetworkGrant = null as any;
utilities.lazyLoad(exports, ["NetworkGrant"], () => require("./networkGrant"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:cloudconnect/network:Network":
                return new Network(name, <any>undefined, { urn })
            case "alicloud:cloudconnect/networkAttachment:NetworkAttachment":
                return new NetworkAttachment(name, <any>undefined, { urn })
            case "alicloud:cloudconnect/networkGrant:NetworkGrant":
                return new NetworkGrant(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "cloudconnect/network", _module)
pulumi.runtime.registerResourceModule("alicloud", "cloudconnect/networkAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "cloudconnect/networkGrant", _module)
