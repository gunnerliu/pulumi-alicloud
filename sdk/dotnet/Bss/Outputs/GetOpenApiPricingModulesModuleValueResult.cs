// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Bss.Outputs
{

    [OutputType]
    public sealed class GetOpenApiPricingModulesModuleValueResult
    {
        public readonly string Name;
        public readonly string Remark;
        public readonly string Type;
        public readonly string Value;

        [OutputConstructor]
        private GetOpenApiPricingModulesModuleValueResult(
            string name,

            string remark,

            string type,

            string value)
        {
            Name = name;
            Remark = remark;
            Type = type;
            Value = value;
        }
    }
}
