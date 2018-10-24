"use strict";
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***
Object.defineProperty(exports, "__esModule", { value: true });
const pulumi = require("@pulumi/pulumi");
/**
 * Provides a CEN bandwidth package resource. The CEN bandwidth package is an abstracted object that includes an interconnection bandwidth and interconnection areas. To buy a bandwidth package, you must specify the areas to connect. An area consists of one or more Alibaba Cloud regions. The areas in CEN include Mainland China, Asia Pacific, North America, and Europe.
 *
 * For information about CEN and how to use it, see [Manage bandwidth packages](https://www.alibabacloud.com/help/doc-detail/65982.htm).
 */
class BandwidthPackage extends pulumi.CustomResource {
    /**
     * Get an existing BandwidthPackage resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name, id, state) {
        return new BandwidthPackage(name, state, { id });
    }
    constructor(name, argsOrState, opts) {
        let inputs = {};
        if (opts && opts.id) {
            const state = argsOrState;
            inputs["bandwidth"] = state ? state.bandwidth : undefined;
            inputs["chargeType"] = state ? state.chargeType : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["expiredTime"] = state ? state.expiredTime : undefined;
            inputs["geographicRegionIds"] = state ? state.geographicRegionIds : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["period"] = state ? state.period : undefined;
            inputs["status"] = state ? state.status : undefined;
        }
        else {
            const args = argsOrState;
            if (!args || args.bandwidth === undefined) {
                throw new Error("Missing required property 'bandwidth'");
            }
            if (!args || args.geographicRegionIds === undefined) {
                throw new Error("Missing required property 'geographicRegionIds'");
            }
            inputs["bandwidth"] = args ? args.bandwidth : undefined;
            inputs["chargeType"] = args ? args.chargeType : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["geographicRegionIds"] = args ? args.geographicRegionIds : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["period"] = args ? args.period : undefined;
            inputs["expiredTime"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
        }
        super("alicloud:cen/bandwidthPackage:BandwidthPackage", name, inputs, opts);
    }
}
exports.BandwidthPackage = BandwidthPackage;
//# sourceMappingURL=bandwidthPackage.js.map