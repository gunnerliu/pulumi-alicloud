"use strict";
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***
Object.defineProperty(exports, "__esModule", { value: true });
const pulumi = require("@pulumi/pulumi");
/**
 * Provides a ESS scaling configuration resource.
 *
 * ~> **NOTE:** Several instance types have outdated in some regions and availability zones, such as `ecs.t1.*`, `ecs.s2.*`, `ecs.n1.*` and so on. If you want to keep them, you should set `is_outdated` to true. For more about the upgraded instance type, refer to `alicloud_instance_types` datasource.
 */
class ScalingConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing ScalingConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name, id, state) {
        return new ScalingConfiguration(name, state, { id });
    }
    constructor(name, argsOrState, opts) {
        let inputs = {};
        if (opts && opts.id) {
            const state = argsOrState;
            inputs["active"] = state ? state.active : undefined;
            inputs["dataDisks"] = state ? state.dataDisks : undefined;
            inputs["enable"] = state ? state.enable : undefined;
            inputs["forceDelete"] = state ? state.forceDelete : undefined;
            inputs["imageId"] = state ? state.imageId : undefined;
            inputs["instanceIds"] = state ? state.instanceIds : undefined;
            inputs["instanceName"] = state ? state.instanceName : undefined;
            inputs["instanceType"] = state ? state.instanceType : undefined;
            inputs["internetChargeType"] = state ? state.internetChargeType : undefined;
            inputs["internetMaxBandwidthIn"] = state ? state.internetMaxBandwidthIn : undefined;
            inputs["internetMaxBandwidthOut"] = state ? state.internetMaxBandwidthOut : undefined;
            inputs["ioOptimized"] = state ? state.ioOptimized : undefined;
            inputs["isOutdated"] = state ? state.isOutdated : undefined;
            inputs["keyName"] = state ? state.keyName : undefined;
            inputs["roleName"] = state ? state.roleName : undefined;
            inputs["scalingConfigurationName"] = state ? state.scalingConfigurationName : undefined;
            inputs["scalingGroupId"] = state ? state.scalingGroupId : undefined;
            inputs["securityGroupId"] = state ? state.securityGroupId : undefined;
            inputs["substitute"] = state ? state.substitute : undefined;
            inputs["systemDiskCategory"] = state ? state.systemDiskCategory : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["userData"] = state ? state.userData : undefined;
        }
        else {
            const args = argsOrState;
            if (!args || args.imageId === undefined) {
                throw new Error("Missing required property 'imageId'");
            }
            if (!args || args.instanceType === undefined) {
                throw new Error("Missing required property 'instanceType'");
            }
            if (!args || args.scalingGroupId === undefined) {
                throw new Error("Missing required property 'scalingGroupId'");
            }
            if (!args || args.securityGroupId === undefined) {
                throw new Error("Missing required property 'securityGroupId'");
            }
            inputs["active"] = args ? args.active : undefined;
            inputs["dataDisks"] = args ? args.dataDisks : undefined;
            inputs["enable"] = args ? args.enable : undefined;
            inputs["forceDelete"] = args ? args.forceDelete : undefined;
            inputs["imageId"] = args ? args.imageId : undefined;
            inputs["instanceIds"] = args ? args.instanceIds : undefined;
            inputs["instanceName"] = args ? args.instanceName : undefined;
            inputs["instanceType"] = args ? args.instanceType : undefined;
            inputs["internetChargeType"] = args ? args.internetChargeType : undefined;
            inputs["internetMaxBandwidthIn"] = args ? args.internetMaxBandwidthIn : undefined;
            inputs["internetMaxBandwidthOut"] = args ? args.internetMaxBandwidthOut : undefined;
            inputs["ioOptimized"] = args ? args.ioOptimized : undefined;
            inputs["isOutdated"] = args ? args.isOutdated : undefined;
            inputs["keyName"] = args ? args.keyName : undefined;
            inputs["roleName"] = args ? args.roleName : undefined;
            inputs["scalingConfigurationName"] = args ? args.scalingConfigurationName : undefined;
            inputs["scalingGroupId"] = args ? args.scalingGroupId : undefined;
            inputs["securityGroupId"] = args ? args.securityGroupId : undefined;
            inputs["substitute"] = args ? args.substitute : undefined;
            inputs["systemDiskCategory"] = args ? args.systemDiskCategory : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["userData"] = args ? args.userData : undefined;
        }
        super("alicloud:ess/scalingConfiguration:ScalingConfiguration", name, inputs, opts);
    }
}
exports.ScalingConfiguration = ScalingConfiguration;
//# sourceMappingURL=scalingConfiguration.js.map