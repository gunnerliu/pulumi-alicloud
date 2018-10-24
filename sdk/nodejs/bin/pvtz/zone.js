"use strict";
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***
Object.defineProperty(exports, "__esModule", { value: true });
const pulumi = require("@pulumi/pulumi");
/**
 * Provides a Private Zone resource.
 *
 * ~> **NOTE:** Terraform will auto Create a Private Zone while it uses `alicloud_pvtz_zone` to build a Private Zone resource.
 */
class Zone extends pulumi.CustomResource {
    /**
     * Get an existing Zone resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name, id, state) {
        return new Zone(name, state, { id });
    }
    constructor(name, argsOrState, opts) {
        let inputs = {};
        if (opts && opts.id) {
            const state = argsOrState;
            inputs["creationTime"] = state ? state.creationTime : undefined;
            inputs["isPtr"] = state ? state.isPtr : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["recordCount"] = state ? state.recordCount : undefined;
            inputs["remark"] = state ? state.remark : undefined;
            inputs["updateTime"] = state ? state.updateTime : undefined;
        }
        else {
            const args = argsOrState;
            inputs["name"] = args ? args.name : undefined;
            inputs["remark"] = args ? args.remark : undefined;
            inputs["creationTime"] = undefined /*out*/;
            inputs["isPtr"] = undefined /*out*/;
            inputs["recordCount"] = undefined /*out*/;
            inputs["updateTime"] = undefined /*out*/;
        }
        super("alicloud:pvtz/zone:Zone", name, inputs, opts);
    }
}
exports.Zone = Zone;
//# sourceMappingURL=zone.js.map