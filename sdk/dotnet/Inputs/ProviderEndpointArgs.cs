// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Inputs
{

    public sealed class ProviderEndpointArgs : Pulumi.ResourceArgs
    {
        [Input("acr")]
        public Input<string>? Acr { get; set; }

        [Input("actiontrail")]
        public Input<string>? Actiontrail { get; set; }

        [Input("adb")]
        public Input<string>? Adb { get; set; }

        [Input("alb")]
        public Input<string>? Alb { get; set; }

        [Input("alidfs")]
        public Input<string>? Alidfs { get; set; }

        [Input("alidns")]
        public Input<string>? Alidns { get; set; }

        [Input("alikafka")]
        public Input<string>? Alikafka { get; set; }

        [Input("apigateway")]
        public Input<string>? Apigateway { get; set; }

        [Input("arms")]
        public Input<string>? Arms { get; set; }

        [Input("bastionhost")]
        public Input<string>? Bastionhost { get; set; }

        [Input("brainIndustrial")]
        public Input<string>? BrainIndustrial { get; set; }

        [Input("bssopenapi")]
        public Input<string>? Bssopenapi { get; set; }

        [Input("cas")]
        public Input<string>? Cas { get; set; }

        [Input("cassandra")]
        public Input<string>? Cassandra { get; set; }

        [Input("cbn")]
        public Input<string>? Cbn { get; set; }

        [Input("cddc")]
        public Input<string>? Cddc { get; set; }

        [Input("cdn")]
        public Input<string>? Cdn { get; set; }

        [Input("cds")]
        public Input<string>? Cds { get; set; }

        [Input("clickhouse")]
        public Input<string>? Clickhouse { get; set; }

        [Input("cloudauth")]
        public Input<string>? Cloudauth { get; set; }

        [Input("cloudphone")]
        public Input<string>? Cloudphone { get; set; }

        [Input("cloudsso")]
        public Input<string>? Cloudsso { get; set; }

        [Input("cms")]
        public Input<string>? Cms { get; set; }

        [Input("config")]
        public Input<string>? Config { get; set; }

        [Input("cr")]
        public Input<string>? Cr { get; set; }

        [Input("cs")]
        public Input<string>? Cs { get; set; }

        [Input("datahub")]
        public Input<string>? Datahub { get; set; }

        [Input("dataworkspublic")]
        public Input<string>? Dataworkspublic { get; set; }

        [Input("dbfs")]
        public Input<string>? Dbfs { get; set; }

        [Input("dcdn")]
        public Input<string>? Dcdn { get; set; }

        [Input("ddosbgp")]
        public Input<string>? Ddosbgp { get; set; }

        [Input("ddoscoo")]
        public Input<string>? Ddoscoo { get; set; }

        [Input("dds")]
        public Input<string>? Dds { get; set; }

        [Input("devopsrdc")]
        public Input<string>? Devopsrdc { get; set; }

        [Input("dg")]
        public Input<string>? Dg { get; set; }

        [Input("dm")]
        public Input<string>? Dm { get; set; }

        [Input("dmsEnterprise")]
        public Input<string>? DmsEnterprise { get; set; }

        [Input("dns")]
        public Input<string>? Dns { get; set; }

        [Input("drds")]
        public Input<string>? Drds { get; set; }

        [Input("dts")]
        public Input<string>? Dts { get; set; }

        [Input("eais")]
        public Input<string>? Eais { get; set; }

        [Input("eci")]
        public Input<string>? Eci { get; set; }

        [Input("ecs")]
        public Input<string>? Ecs { get; set; }

        [Input("edsuser")]
        public Input<string>? Edsuser { get; set; }

        [Input("ehpc")]
        public Input<string>? Ehpc { get; set; }

        [Input("eipanycast")]
        public Input<string>? Eipanycast { get; set; }

        [Input("elasticsearch")]
        public Input<string>? Elasticsearch { get; set; }

        [Input("emr")]
        public Input<string>? Emr { get; set; }

        [Input("ens")]
        public Input<string>? Ens { get; set; }

        [Input("ess")]
        public Input<string>? Ess { get; set; }

        [Input("eventbridge")]
        public Input<string>? Eventbridge { get; set; }

        [Input("fc")]
        public Input<string>? Fc { get; set; }

        [Input("fnf")]
        public Input<string>? Fnf { get; set; }

        [Input("ga")]
        public Input<string>? Ga { get; set; }

        [Input("gds")]
        public Input<string>? Gds { get; set; }

        [Input("gpdb")]
        public Input<string>? Gpdb { get; set; }

        [Input("gwsecd")]
        public Input<string>? Gwsecd { get; set; }

        [Input("hbr")]
        public Input<string>? Hbr { get; set; }

        [Input("hcsSgw")]
        public Input<string>? HcsSgw { get; set; }

        [Input("hitsdb")]
        public Input<string>? Hitsdb { get; set; }

        [Input("imm")]
        public Input<string>? Imm { get; set; }

        [Input("imp")]
        public Input<string>? Imp { get; set; }

        [Input("ims")]
        public Input<string>? Ims { get; set; }

        [Input("iot")]
        public Input<string>? Iot { get; set; }

        [Input("kms")]
        public Input<string>? Kms { get; set; }

        [Input("kvstore")]
        public Input<string>? Kvstore { get; set; }

        [Input("location")]
        public Input<string>? Location { get; set; }

        [Input("log")]
        public Input<string>? Log { get; set; }

        [Input("market")]
        public Input<string>? Market { get; set; }

        [Input("maxcompute")]
        public Input<string>? Maxcompute { get; set; }

        [Input("mhub")]
        public Input<string>? Mhub { get; set; }

        [Input("mns")]
        public Input<string>? Mns { get; set; }

        [Input("mscopensubscription")]
        public Input<string>? Mscopensubscription { get; set; }

        [Input("mse")]
        public Input<string>? Mse { get; set; }

        [Input("nas")]
        public Input<string>? Nas { get; set; }

        [Input("ons")]
        public Input<string>? Ons { get; set; }

        [Input("onsproxy")]
        public Input<string>? Onsproxy { get; set; }

        [Input("oos")]
        public Input<string>? Oos { get; set; }

        [Input("opensearch")]
        public Input<string>? Opensearch { get; set; }

        [Input("oss")]
        public Input<string>? Oss { get; set; }

        [Input("ots")]
        public Input<string>? Ots { get; set; }

        [Input("polardb")]
        public Input<string>? Polardb { get; set; }

        [Input("privatelink")]
        public Input<string>? Privatelink { get; set; }

        [Input("pvtz")]
        public Input<string>? Pvtz { get; set; }

        [Input("quickbi")]
        public Input<string>? Quickbi { get; set; }

        [Input("quotas")]
        public Input<string>? Quotas { get; set; }

        [Input("rKvstore")]
        public Input<string>? RKvstore { get; set; }

        [Input("ram")]
        public Input<string>? Ram { get; set; }

        [Input("rds")]
        public Input<string>? Rds { get; set; }

        [Input("redisa")]
        public Input<string>? Redisa { get; set; }

        [Input("resourcemanager")]
        public Input<string>? Resourcemanager { get; set; }

        [Input("resourcesharing")]
        public Input<string>? Resourcesharing { get; set; }

        [Input("ros")]
        public Input<string>? Ros { get; set; }

        [Input("sas")]
        public Input<string>? Sas { get; set; }

        [Input("scdn")]
        public Input<string>? Scdn { get; set; }

        [Input("sddp")]
        public Input<string>? Sddp { get; set; }

        [Input("serverless")]
        public Input<string>? Serverless { get; set; }

        [Input("servicemesh")]
        public Input<string>? Servicemesh { get; set; }

        [Input("sgw")]
        public Input<string>? Sgw { get; set; }

        [Input("slb")]
        public Input<string>? Slb { get; set; }

        [Input("sts")]
        public Input<string>? Sts { get; set; }

        [Input("swas")]
        public Input<string>? Swas { get; set; }

        [Input("vod")]
        public Input<string>? Vod { get; set; }

        [Input("vpc")]
        public Input<string>? Vpc { get; set; }

        [Input("vs")]
        public Input<string>? Vs { get; set; }

        [Input("waf")]
        public Input<string>? Waf { get; set; }

        [Input("wafOpenapi")]
        public Input<string>? WafOpenapi { get; set; }

        public ProviderEndpointArgs()
        {
        }
    }
}
