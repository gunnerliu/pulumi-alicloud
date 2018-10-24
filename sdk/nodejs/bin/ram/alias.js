"use strict";
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***
Object.defineProperty(exports, "__esModule", { value: true });
const pulumi = require("@pulumi/pulumi");
/**
 * ~> **NOTE:** This resource has been deprecated from [v1.3.2](https://github.com/alibaba/terraform-provider/releases/tag/V1.3.2). New resource `alicloud_ram_account_alias` will replace.
 */
class Alias extends pulumi.CustomResource {
    /**
     * Get an existing Alias resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name, id, state) {
        return new Alias(name, state, { id });
    }
    constructor(name, argsOrState, opts) {
        let inputs = {};
        if (opts && opts.id) {
            const state = argsOrState;
            inputs["accountAlias"] = state ? state.accountAlias : undefined;
        }
        else {
            const args = argsOrState;
            if (!args || args.accountAlias === undefined) {
                throw new Error("Missing required property 'accountAlias'");
            }
            inputs["accountAlias"] = args ? args.accountAlias : undefined;
        }
        super("alicloud:ram/alias:Alias", name, inputs, opts);
    }
}
exports.Alias = Alias;
//# sourceMappingURL=alias.js.map