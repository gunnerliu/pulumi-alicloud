"use strict";
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***
Object.defineProperty(exports, "__esModule", { value: true });
const pulumi = require("@pulumi/pulumi");
/**
 * Provides an ApsaraDB Redis / Memcache instance resource. A DB instance is an isolated database environment in the cloud. It can be associated with IP whitelists and backup configuration which are separate resource providers.
 */
class Instance extends pulumi.CustomResource {
    /**
     * Get an existing Instance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name, id, state) {
        return new Instance(name, state, { id });
    }
    constructor(name, argsOrState, opts) {
        let inputs = {};
        if (opts && opts.id) {
            const state = argsOrState;
            inputs["availabilityZone"] = state ? state.availabilityZone : undefined;
            inputs["backupId"] = state ? state.backupId : undefined;
            inputs["connectionDomain"] = state ? state.connectionDomain : undefined;
            inputs["engineVersion"] = state ? state.engineVersion : undefined;
            inputs["instanceChargeType"] = state ? state.instanceChargeType : undefined;
            inputs["instanceClass"] = state ? state.instanceClass : undefined;
            inputs["instanceName"] = state ? state.instanceName : undefined;
            inputs["instanceType"] = state ? state.instanceType : undefined;
            inputs["password"] = state ? state.password : undefined;
            inputs["period"] = state ? state.period : undefined;
            inputs["privateIp"] = state ? state.privateIp : undefined;
            inputs["securityIps"] = state ? state.securityIps : undefined;
            inputs["vswitchId"] = state ? state.vswitchId : undefined;
        }
        else {
            const args = argsOrState;
            if (!args || args.instanceClass === undefined) {
                throw new Error("Missing required property 'instanceClass'");
            }
            if (!args || args.password === undefined) {
                throw new Error("Missing required property 'password'");
            }
            inputs["availabilityZone"] = args ? args.availabilityZone : undefined;
            inputs["backupId"] = args ? args.backupId : undefined;
            inputs["engineVersion"] = args ? args.engineVersion : undefined;
            inputs["instanceChargeType"] = args ? args.instanceChargeType : undefined;
            inputs["instanceClass"] = args ? args.instanceClass : undefined;
            inputs["instanceName"] = args ? args.instanceName : undefined;
            inputs["instanceType"] = args ? args.instanceType : undefined;
            inputs["password"] = args ? args.password : undefined;
            inputs["period"] = args ? args.period : undefined;
            inputs["privateIp"] = args ? args.privateIp : undefined;
            inputs["securityIps"] = args ? args.securityIps : undefined;
            inputs["vswitchId"] = args ? args.vswitchId : undefined;
            inputs["connectionDomain"] = undefined /*out*/;
        }
        super("alicloud:kvstore/instance:Instance", name, inputs, opts);
    }
}
exports.Instance = Instance;
//# sourceMappingURL=instance.js.map