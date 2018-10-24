"use strict";
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***
Object.defineProperty(exports, "__esModule", { value: true });
const pulumi = require("@pulumi/pulumi");
/**
 * Provides a RAM Role resource.
 *
 * ~> **NOTE:** When you want to destroy this resource forcefully(means remove all the relationships associated with it automatically and then destroy it) without set `force`  with `true` at beginning, you need add `force = true` to configuration file and run `terraform plan`, then you can delete resource forcefully.
 */
class Role extends pulumi.CustomResource {
    /**
     * Get an existing Role resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name, id, state) {
        return new Role(name, state, { id });
    }
    constructor(name, argsOrState, opts) {
        let inputs = {};
        if (opts && opts.id) {
            const state = argsOrState;
            inputs["arn"] = state ? state.arn : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["document"] = state ? state.document : undefined;
            inputs["force"] = state ? state.force : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["ramUsers"] = state ? state.ramUsers : undefined;
            inputs["services"] = state ? state.services : undefined;
            inputs["version"] = state ? state.version : undefined;
        }
        else {
            const args = argsOrState;
            inputs["description"] = args ? args.description : undefined;
            inputs["document"] = args ? args.document : undefined;
            inputs["force"] = args ? args.force : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["ramUsers"] = args ? args.ramUsers : undefined;
            inputs["services"] = args ? args.services : undefined;
            inputs["version"] = args ? args.version : undefined;
            inputs["arn"] = undefined /*out*/;
        }
        super("alicloud:ram/role:Role", name, inputs, opts);
    }
}
exports.Role = Role;
//# sourceMappingURL=role.js.map