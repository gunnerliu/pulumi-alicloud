# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities, _tables

__all__ = ['EnterpriseUserArgs', 'EnterpriseUser']

@pulumi.input_type
class EnterpriseUserArgs:
    def __init__(__self__, *,
                 uid: pulumi.Input[str],
                 max_execute_count: Optional[pulumi.Input[int]] = None,
                 max_result_count: Optional[pulumi.Input[int]] = None,
                 mobile: Optional[pulumi.Input[str]] = None,
                 nick_name: Optional[pulumi.Input[str]] = None,
                 role_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tid: Optional[pulumi.Input[int]] = None,
                 user_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a EnterpriseUser resource.
        :param pulumi.Input[str] uid: The Alibaba Cloud unique ID (UID) of the user to add.
        :param pulumi.Input[int] max_execute_count: Maximum number of inquiries on the day.
        :param pulumi.Input[int] max_result_count: Query the maximum number of rows on the day.
        :param pulumi.Input[str] mobile: The DingTalk number or mobile number of the user.
        :param pulumi.Input[str] nick_name: It has been deprecated from 1.100.0 and use `user_name` instead.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] role_names: The roles that the user plays.
        :param pulumi.Input[str] status: The state of DMS Enterprise User. Valid values: `NORMAL`, `DISABLE`.
        :param pulumi.Input[int] tid: The tenant ID.
        :param pulumi.Input[str] user_name: The nickname of the user.
        """
        pulumi.set(__self__, "uid", uid)
        if max_execute_count is not None:
            pulumi.set(__self__, "max_execute_count", max_execute_count)
        if max_result_count is not None:
            pulumi.set(__self__, "max_result_count", max_result_count)
        if mobile is not None:
            pulumi.set(__self__, "mobile", mobile)
        if nick_name is not None:
            warnings.warn("""Field 'nick_name' has been deprecated from version 1.100.0. Use 'user_name' instead.""", DeprecationWarning)
            pulumi.log.warn("""nick_name is deprecated: Field 'nick_name' has been deprecated from version 1.100.0. Use 'user_name' instead.""")
        if nick_name is not None:
            pulumi.set(__self__, "nick_name", nick_name)
        if role_names is not None:
            pulumi.set(__self__, "role_names", role_names)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tid is not None:
            pulumi.set(__self__, "tid", tid)
        if user_name is not None:
            pulumi.set(__self__, "user_name", user_name)

    @property
    @pulumi.getter
    def uid(self) -> pulumi.Input[str]:
        """
        The Alibaba Cloud unique ID (UID) of the user to add.
        """
        return pulumi.get(self, "uid")

    @uid.setter
    def uid(self, value: pulumi.Input[str]):
        pulumi.set(self, "uid", value)

    @property
    @pulumi.getter(name="maxExecuteCount")
    def max_execute_count(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum number of inquiries on the day.
        """
        return pulumi.get(self, "max_execute_count")

    @max_execute_count.setter
    def max_execute_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_execute_count", value)

    @property
    @pulumi.getter(name="maxResultCount")
    def max_result_count(self) -> Optional[pulumi.Input[int]]:
        """
        Query the maximum number of rows on the day.
        """
        return pulumi.get(self, "max_result_count")

    @max_result_count.setter
    def max_result_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_result_count", value)

    @property
    @pulumi.getter
    def mobile(self) -> Optional[pulumi.Input[str]]:
        """
        The DingTalk number or mobile number of the user.
        """
        return pulumi.get(self, "mobile")

    @mobile.setter
    def mobile(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mobile", value)

    @property
    @pulumi.getter(name="nickName")
    def nick_name(self) -> Optional[pulumi.Input[str]]:
        """
        It has been deprecated from 1.100.0 and use `user_name` instead.
        """
        return pulumi.get(self, "nick_name")

    @nick_name.setter
    def nick_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "nick_name", value)

    @property
    @pulumi.getter(name="roleNames")
    def role_names(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The roles that the user plays.
        """
        return pulumi.get(self, "role_names")

    @role_names.setter
    def role_names(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "role_names", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The state of DMS Enterprise User. Valid values: `NORMAL`, `DISABLE`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tid(self) -> Optional[pulumi.Input[int]]:
        """
        The tenant ID.
        """
        return pulumi.get(self, "tid")

    @tid.setter
    def tid(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "tid", value)

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> Optional[pulumi.Input[str]]:
        """
        The nickname of the user.
        """
        return pulumi.get(self, "user_name")

    @user_name.setter
    def user_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_name", value)


class EnterpriseUser(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 max_execute_count: Optional[pulumi.Input[int]] = None,
                 max_result_count: Optional[pulumi.Input[int]] = None,
                 mobile: Optional[pulumi.Input[str]] = None,
                 nick_name: Optional[pulumi.Input[str]] = None,
                 role_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tid: Optional[pulumi.Input[int]] = None,
                 uid: Optional[pulumi.Input[str]] = None,
                 user_name: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a DMS Enterprise User resource. For information about Alidms Enterprise User and how to use it, see [What is Resource Alidms Enterprise User](https://www.alibabacloud.com/help/doc-detail/98001.htm).

        > **NOTE:** Available in 1.90.0+.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.dms.EnterpriseUser("example",
            mobile="1591066xxxx",
            role_names=["DBA"],
            uid="uid",
            user_name="tf-test")
        ```

        ## Import

        DMS Enterprise User can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:dms/enterpriseUser:EnterpriseUser example 24356xxx
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] max_execute_count: Maximum number of inquiries on the day.
        :param pulumi.Input[int] max_result_count: Query the maximum number of rows on the day.
        :param pulumi.Input[str] mobile: The DingTalk number or mobile number of the user.
        :param pulumi.Input[str] nick_name: It has been deprecated from 1.100.0 and use `user_name` instead.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] role_names: The roles that the user plays.
        :param pulumi.Input[str] status: The state of DMS Enterprise User. Valid values: `NORMAL`, `DISABLE`.
        :param pulumi.Input[int] tid: The tenant ID.
        :param pulumi.Input[str] uid: The Alibaba Cloud unique ID (UID) of the user to add.
        :param pulumi.Input[str] user_name: The nickname of the user.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EnterpriseUserArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a DMS Enterprise User resource. For information about Alidms Enterprise User and how to use it, see [What is Resource Alidms Enterprise User](https://www.alibabacloud.com/help/doc-detail/98001.htm).

        > **NOTE:** Available in 1.90.0+.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.dms.EnterpriseUser("example",
            mobile="1591066xxxx",
            role_names=["DBA"],
            uid="uid",
            user_name="tf-test")
        ```

        ## Import

        DMS Enterprise User can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:dms/enterpriseUser:EnterpriseUser example 24356xxx
        ```

        :param str resource_name: The name of the resource.
        :param EnterpriseUserArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EnterpriseUserArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 max_execute_count: Optional[pulumi.Input[int]] = None,
                 max_result_count: Optional[pulumi.Input[int]] = None,
                 mobile: Optional[pulumi.Input[str]] = None,
                 nick_name: Optional[pulumi.Input[str]] = None,
                 role_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tid: Optional[pulumi.Input[int]] = None,
                 uid: Optional[pulumi.Input[str]] = None,
                 user_name: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
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
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['max_execute_count'] = max_execute_count
            __props__['max_result_count'] = max_result_count
            __props__['mobile'] = mobile
            if nick_name is not None and not opts.urn:
                warnings.warn("""Field 'nick_name' has been deprecated from version 1.100.0. Use 'user_name' instead.""", DeprecationWarning)
                pulumi.log.warn("""nick_name is deprecated: Field 'nick_name' has been deprecated from version 1.100.0. Use 'user_name' instead.""")
            __props__['nick_name'] = nick_name
            __props__['role_names'] = role_names
            __props__['status'] = status
            __props__['tid'] = tid
            if uid is None and not opts.urn:
                raise TypeError("Missing required property 'uid'")
            __props__['uid'] = uid
            __props__['user_name'] = user_name
        super(EnterpriseUser, __self__).__init__(
            'alicloud:dms/enterpriseUser:EnterpriseUser',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            max_execute_count: Optional[pulumi.Input[int]] = None,
            max_result_count: Optional[pulumi.Input[int]] = None,
            mobile: Optional[pulumi.Input[str]] = None,
            nick_name: Optional[pulumi.Input[str]] = None,
            role_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tid: Optional[pulumi.Input[int]] = None,
            uid: Optional[pulumi.Input[str]] = None,
            user_name: Optional[pulumi.Input[str]] = None) -> 'EnterpriseUser':
        """
        Get an existing EnterpriseUser resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] max_execute_count: Maximum number of inquiries on the day.
        :param pulumi.Input[int] max_result_count: Query the maximum number of rows on the day.
        :param pulumi.Input[str] mobile: The DingTalk number or mobile number of the user.
        :param pulumi.Input[str] nick_name: It has been deprecated from 1.100.0 and use `user_name` instead.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] role_names: The roles that the user plays.
        :param pulumi.Input[str] status: The state of DMS Enterprise User. Valid values: `NORMAL`, `DISABLE`.
        :param pulumi.Input[int] tid: The tenant ID.
        :param pulumi.Input[str] uid: The Alibaba Cloud unique ID (UID) of the user to add.
        :param pulumi.Input[str] user_name: The nickname of the user.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["max_execute_count"] = max_execute_count
        __props__["max_result_count"] = max_result_count
        __props__["mobile"] = mobile
        __props__["nick_name"] = nick_name
        __props__["role_names"] = role_names
        __props__["status"] = status
        __props__["tid"] = tid
        __props__["uid"] = uid
        __props__["user_name"] = user_name
        return EnterpriseUser(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="maxExecuteCount")
    def max_execute_count(self) -> pulumi.Output[Optional[int]]:
        """
        Maximum number of inquiries on the day.
        """
        return pulumi.get(self, "max_execute_count")

    @property
    @pulumi.getter(name="maxResultCount")
    def max_result_count(self) -> pulumi.Output[Optional[int]]:
        """
        Query the maximum number of rows on the day.
        """
        return pulumi.get(self, "max_result_count")

    @property
    @pulumi.getter
    def mobile(self) -> pulumi.Output[Optional[str]]:
        """
        The DingTalk number or mobile number of the user.
        """
        return pulumi.get(self, "mobile")

    @property
    @pulumi.getter(name="nickName")
    def nick_name(self) -> pulumi.Output[str]:
        """
        It has been deprecated from 1.100.0 and use `user_name` instead.
        """
        return pulumi.get(self, "nick_name")

    @property
    @pulumi.getter(name="roleNames")
    def role_names(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The roles that the user plays.
        """
        return pulumi.get(self, "role_names")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[Optional[str]]:
        """
        The state of DMS Enterprise User. Valid values: `NORMAL`, `DISABLE`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tid(self) -> pulumi.Output[Optional[int]]:
        """
        The tenant ID.
        """
        return pulumi.get(self, "tid")

    @property
    @pulumi.getter
    def uid(self) -> pulumi.Output[str]:
        """
        The Alibaba Cloud unique ID (UID) of the user to add.
        """
        return pulumi.get(self, "uid")

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> pulumi.Output[str]:
        """
        The nickname of the user.
        """
        return pulumi.get(self, "user_name")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

