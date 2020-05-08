# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class ApplicationScale(pulumi.CustomResource):
    app_id: pulumi.Output[str]
    """
    The ID of the application that you want to deploy.
    """
    deploy_group: pulumi.Output[str]
    """
    The ID of the instance group to which you want to add ECS instances to scale out the application.
    """
    ecc_info: pulumi.Output[str]
    """
    The ecc information of the resource supplied above. The value is formulated as `<ecc1,ecc2>`.
    """
    ecu_infos: pulumi.Output[list]
    """
    The IDs of the Elastic Compute Unit (ECU) where you want to deploy the application. Type: List.
    """
    force_status: pulumi.Output[bool]
    """
    This parameter specifies whether to forcibly remove an ECS instance where the application is deployed. It is set as true only after the ECS instance expires. In normal cases, this parameter do not need to be specified.
    """
    def __init__(__self__, resource_name, opts=None, app_id=None, deploy_group=None, ecu_infos=None, force_status=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides an EDAS application scale resource.

        > **NOTE:** Available in 1.82.0+



        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] app_id: The ID of the application that you want to deploy.
        :param pulumi.Input[str] deploy_group: The ID of the instance group to which you want to add ECS instances to scale out the application.
        :param pulumi.Input[list] ecu_infos: The IDs of the Elastic Compute Unit (ECU) where you want to deploy the application. Type: List.
        :param pulumi.Input[bool] force_status: This parameter specifies whether to forcibly remove an ECS instance where the application is deployed. It is set as true only after the ECS instance expires. In normal cases, this parameter do not need to be specified.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if app_id is None:
                raise TypeError("Missing required property 'app_id'")
            __props__['app_id'] = app_id
            if deploy_group is None:
                raise TypeError("Missing required property 'deploy_group'")
            __props__['deploy_group'] = deploy_group
            if ecu_infos is None:
                raise TypeError("Missing required property 'ecu_infos'")
            __props__['ecu_infos'] = ecu_infos
            __props__['force_status'] = force_status
            __props__['ecc_info'] = None
        super(ApplicationScale, __self__).__init__(
            'alicloud:edas/applicationScale:ApplicationScale',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, app_id=None, deploy_group=None, ecc_info=None, ecu_infos=None, force_status=None):
        """
        Get an existing ApplicationScale resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] app_id: The ID of the application that you want to deploy.
        :param pulumi.Input[str] deploy_group: The ID of the instance group to which you want to add ECS instances to scale out the application.
        :param pulumi.Input[str] ecc_info: The ecc information of the resource supplied above. The value is formulated as `<ecc1,ecc2>`.
        :param pulumi.Input[list] ecu_infos: The IDs of the Elastic Compute Unit (ECU) where you want to deploy the application. Type: List.
        :param pulumi.Input[bool] force_status: This parameter specifies whether to forcibly remove an ECS instance where the application is deployed. It is set as true only after the ECS instance expires. In normal cases, this parameter do not need to be specified.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["app_id"] = app_id
        __props__["deploy_group"] = deploy_group
        __props__["ecc_info"] = ecc_info
        __props__["ecu_infos"] = ecu_infos
        __props__["force_status"] = force_status
        return ApplicationScale(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

